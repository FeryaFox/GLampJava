package ru.feryafox.GLamp.GLampData.GLampCommands.syncs;

import lombok.Getter;
import ru.feryafox.GLamp.GLamp;
import ru.feryafox.GLamp.GLampData.GLampCommands.LampCommand;
import ru.feryafox.GLamp.GLampData.GLampData;

/**
 * Команда "комплексная синхронизация (Controls, Settings, Modes, Dawn, Palette)"
 */
public class SyncDataCommand implements LampCommand {
    private final GLamp lamp;
    @Getter
    private GLampData result;

    public SyncDataCommand(GLamp lamp) {
        this.lamp = lamp;
    }

    @Override
    public void execute() {
        this.result = lamp.syncData();
    }

}