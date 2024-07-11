package ru.feryafox.GLamp;

import ru.feryafox.GLamp.Exceptions.GLampParamsException;
import ru.feryafox.GLamp.Exceptions.GLampRequestsException;
import ru.feryafox.GLamp.Exceptions.GLampSyncTimeoutException;
import ru.feryafox.GLamp.GLampData.*;

import java.io.IOException;
import java.net.*;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class GLamp {
    private String key = "GL";
    private String lampIp = null;
    private String localIp = null;
    private Integer port = null;
    private String netmask = "255.255.255.0";
    private Integer groupId = 1;
    private DatagramSocket socket = null;

    public Integer getPort() {
        return port;
    }

    public String getLampIp() {
        return lampIp;
    }

    public String getLocalIp() {
        return localIp;
    }

    public String getKey() {
        return key;
    }

    public String getNetmask() {
        return netmask;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
        genPort();
    }

    public void setNetmask(String netmask) {
        this.netmask = netmask;
        genBroadcastLampIp();
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public void setLocalIp(String localIp) {
        this.localIp = localIp;
    }

    public void setLampIp(String lampIp) {
        this.lampIp = lampIp;
    }

    public void setKey(String key) {
        this.key = key;
        genPort();
    }

    private GLamp(String key, String localIp, String lampIp, Integer port, String netmask, Integer groupId){
        this.key = key;
        this.groupId = groupId;
        this.netmask = netmask;
        this.localIp = Objects.requireNonNullElseGet(localIp, GLampUtils::getLocalIp);
        this.lampIp = Objects.requireNonNullElseGet(lampIp, () -> GLampUtils.getBroadcastAddress(this.localIp, this.netmask));
        this.port = Objects.requireNonNullElseGet(port, () -> GLampUtils.genPort(key, groupId));
        createSocket();
    }

    private void genPort(){
        this.port = GLampUtils.genPort(key, groupId);
    }

    private void genBroadcastLampIp(){
        this.lampIp = GLampUtils.getBroadcastAddress(this.localIp, this.netmask);
    }

    public static class Builder{

        private String key = "GL";
        private String lampIp = null;
        private String localIp = null;
        private Integer port = null;
        private String netmask = "255.255.255.0";
        private Integer groupId = 1;


        public Builder setKey(String key){
            this.key = key;
            return this;
        }

        public Builder setLampIp(String lampIp){
            this.lampIp = lampIp;
            return this;
        }

        public Builder setLocalIp(String localIp){
            this.localIp = localIp;
            return this;
        }

        public Builder setPort(Integer port){
            this.port = port;
            return this;
        }

        public Builder setNetmask(String netmask){
            this.netmask = netmask;
            return this;
        }

        public Builder setGroupId(Integer groupId){
            this.groupId = groupId;
            return this;
        }

        public GLamp build(){
            return new GLamp(key, localIp, lampIp, port, netmask, groupId);
        }
    }

    private void createSocket(){
        try {
            socket = new DatagramSocket(null);
            socket.setBroadcast(true);
            socket.setSoTimeout(3000);
            socket.bind(new InetSocketAddress(localIp, port));
        }
        catch (SocketException e){
            throw new Error("Failed to create a socket", e);
        }
    }

    private void sendRequests(String command){
        try {
            String message = "GL," + command;
            byte[] buffer = message.getBytes();
            InetAddress address = InetAddress.getByName(lampIp);
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length, address, port);
            for (int i = 0; i < 5; i++) {
                socket.send(packet);
            }
            System.out.println(message);
        }
        catch (IOException e){
            throw new GLampRequestsException(e.toString());
        }
    }

    private String getResponse(String response_type){
        return getResponse(20, response_type);
    }

    private String getResponse(int attempts, String response_type){
        try {
            byte[] buffer = new byte[8192];
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
            socket.receive(packet);
            String result = new String(packet.getData(), 0, packet.getLength());
            InetAddress address = packet.getAddress();

            if (result.startsWith("GL_RESP,") && result.charAt(8) != response_type.charAt(0)) {
                return getResponse(attempts, response_type);
            }

            if (address.getHostAddress().equals(localIp) || result.startsWith("GL_ONL") ) {
                if (attempts > 0) {
                    return getResponse(attempts - 1, response_type);
                }
                return null;
            }

            return result;
        } catch (IOException e) {
            throw new GLampSyncTimeoutException(e.toString());
        }
    }

    public void turnOff(){
        String command = "0,0," + GLampUtils.getNowDate(0);
        sendRequests(command);
    }

    public void turnOn(){
        String command = "0,1," + GLampUtils.getNowDate(0);
        sendRequests(command);
    }

    public void minBrightness(){
        String command = "0,2";
        sendRequests(command);
    }

    public void maxBrightness(){
        String command = "0,3";
        sendRequests(command);
    }

    public void prevMode(){
        String command = "0,4," + GLampUtils.getNowDate(0);
        sendRequests(command);
    }

    public void nextMode(){
        String command = "0,5," + GLampUtils.getNowDate(0);
        sendRequests(command);
    }

    public void setMode(int mode){
        String command = "0,6," + mode;
        sendRequests(command);
    }

    public void setWifiMode(int mode){
        /*
          Set Wi-Fi mode (0 - AP, 1 - Local)
         */
        String command = "0,7," + mode;
        sendRequests(command);
    }

    public void changeRole(int role) {
        /*
          Change the role of the lamp (0 - Slave, 1 - Master)
         */
        if ( role < 0  || role > 1) throw new GLampParamsException("changeRole", "Параметр role должный быть 0 (Slave) или 1 (Master)");
        String command = "0,8," + role;
        sendRequests(command);
    }

    public void changeGroup(int group) {
        /*
            Change the group of the lamp.
         */
        if ( group < 0) throw new GLampParamsException("changeGroup", "Параметр group должный быть положительным");
        String command = "0,9," + group;
        sendRequests(command);
    }

    public void setWifi(String ssid, String password) {
        if (ssid.contains(",")) throw new GLampParamsException("changeGroup", "В параметре ssid не должно быть символа ,");
        if (password.contains(",")) throw new GLampParamsException("changeGroup", "В параметре password не должно быть символа ,");
        String command = "0,10," + ssid + "," + password;
        sendRequests(command);
    }

    public void restart(){
        String command = "0,11";
        sendRequests(command);
    }

    public void firmwareUpdate(){
        String command = "0,12";
        sendRequests(command);
    }

    public void turnOffTimer(int minutes)  {
        if ( minutes < 0  || minutes > 255) throw new GLampParamsException("turnOffTimer", "Параметр minutes должный быть в промежутке от 0 до 255");
        String command = "0,13," + minutes;
        sendRequests(command);
    }

    public void updateSettings(GLampSettings settings)  {
        String command = "1," + settings.toString() + "," + GLampUtils.getNowDate(0);
        sendRequests(command);
    }

    public void uploadModes(GLampModes modes) {
        StringBuilder command_sb = new StringBuilder();
        command_sb.append("2,");
        command_sb.append(modes.getModesCount());
        command_sb.append(",");
        for (GLampMode mode : modes.getModes()) {
            command_sb.append(mode.toString());
            command_sb.append(",");
        }
        command_sb.deleteCharAt(modes.getCurrentMode());
        command_sb.append(",");
        command_sb.append(GLampUtils.getNowDate(0));
        sendRequests(command_sb.toString());
    }

    public void setDawn(GLampDawn dawn){
        String command = "3," + dawn.toString() + "," + GLampUtils.getNowDate(0);
        sendRequests(command);
    }

    public void setPalette(GLampPalette palette){
        String command = "5," +
                palette.toString() +
                "," +
                GLampUtils.getNowDate(0);
        sendRequests(command);
    }

    public GLampControls syncControls(){
        String command = "20,0";
        sendRequests(command);
        String response = getResponse("0");

        return GLampControls.buildFromResponse(response);
    }

    public GLampSettings syncSettings(){
        String command = "20,1";
        sendRequests(command);
        String response = getResponse("1");

        return GLampSettings.buildFromResponse(response);
    }

    public GLampModes syncModes(){
        String command = "20,2";
        sendRequests(command);
        String response = getResponse("2");

        return GLampModes.buildFromResponse(response);
    }

    public GLampDawn syncDawn(){
        String command = "20,3";
        sendRequests(command);
        String response = getResponse("3");

        return GLampDawn.buildFromResponse(response);
    }

    public GLampPalette syncPalette(){
        String command = "20,5";
        sendRequests(command);
        String response = getResponse("5");

        return GLampPalette.buildFromResponse(response);
    }

    public GLampData syncData(){

        GLampControls controls = null;
        GLampSettings settings = null;
        GLampModes modes = null;
        GLampDawn dawn = null;
        GLampPalette palette = null;

        try {
            TimeUnit.SECONDS.sleep(1);
            controls = syncControls();
            TimeUnit.SECONDS.sleep(1);
            settings = syncSettings();
            TimeUnit.SECONDS.sleep(1);
            modes = syncModes();
            TimeUnit.SECONDS.sleep(1);
            dawn = syncDawn();
            TimeUnit.SECONDS.sleep(1);
            palette = syncPalette();
            TimeUnit.SECONDS.sleep(1);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (controls == null || settings == null || modes == null || dawn == null || palette == null) {
            return null;
        }

        return new GLampData(controls, settings, modes, dawn, palette);
    }
}
