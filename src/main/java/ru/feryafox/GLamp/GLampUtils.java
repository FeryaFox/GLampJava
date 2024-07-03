package ru.feryafox.GLamp;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class GLampUtils {
    static public int genPort(String key, int groupId) {
        int port = 17;
        for (int i = 0; i < key.length(); i++) {
            port *= key.charAt(i);
        }
        port %= 65536;
        port %= 15000;
        port += 50000;
        port += groupId;
        return port;
    }

    static public String getBroadcastAddress(String localIp, String netmask) {
        String[] ipParts = localIp.split("\\.");
        String[] maskParts = netmask.split("\\.");

        int[] ip = new int[4];
        int[] mask = new int[4];

        for (int i = 0; i < 4; i++) {
            ip[i] = Integer.parseInt(ipParts[i]);
            mask[i] = Integer.parseInt(maskParts[i]);
        }

        StringBuilder broadcast = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            int part = (ip[i] | (mask[i] ^ 255));
            broadcast.append(part);
            if (i < 3) {
                broadcast.append(".");
            }
        }

        return broadcast.toString();
    }

    static public String getLocalIp(){
        String localIPAddress = "";
        try {
            localIPAddress = InetAddress.getLocalHost().getHostAddress();
        }
        catch (UnknownHostException e){
            System.out.println("Error getting local IP address: " + e.getMessage());
        }
        return localIPAddress;
    }

    static public String getNowDate(int delay) {
        ZonedDateTime now = ZonedDateTime.now(ZoneId.systemDefault());
        ZonedDateTime day = now.plusSeconds(1 + delay);
        return String.format("%d,%d,%d,%d", day.getDayOfWeek().getValue(), day.getHour(), day.getMinute(), day.getSecond());
    }
}
