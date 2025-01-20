package ru.feryafox.GLamp.GLampData.GLampCommands.controls;

import ru.feryafox.GLamp.GLamp;
import ru.feryafox.GLamp.GLampData.GLampCommands.LampCommand;

/**
 * Команда "установить Wi-Fi-режим (AP/Local)"
 */
public class SetWifiModeCommand implements LampCommand {
    private final GLamp lamp;
    private final int wifiMode;  // 0 – AP, 1 – Local

    public SetWifiModeCommand(GLamp lamp, int wifiMode) {
        this.lamp = lamp;
        this.wifiMode = wifiMode;
    }

    @Override
    public void execute() {
        lamp.setWifiMode(wifiMode);
    }
}
