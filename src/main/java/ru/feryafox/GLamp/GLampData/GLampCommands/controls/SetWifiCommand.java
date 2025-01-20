package ru.feryafox.GLamp.GLampData.GLampCommands.controls;

import ru.feryafox.GLamp.GLamp;
import ru.feryafox.GLamp.GLampData.GLampCommands.LampCommand;

/**
 * Команда "установить Wi-Fi (SSID/Password)"
 */
public class SetWifiCommand implements LampCommand {
    private final GLamp lamp;
    private final String ssid;
    private final String password;

    public SetWifiCommand(GLamp lamp, String ssid, String password) {
        this.lamp = lamp;
        this.ssid = ssid;
        this.password = password;
    }

    @Override
    public void execute() {
        lamp.setWifi(ssid, password);
    }
}
