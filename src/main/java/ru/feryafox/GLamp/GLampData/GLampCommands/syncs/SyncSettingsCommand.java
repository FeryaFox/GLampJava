package ru.feryafox.GLamp.GLampData.GLampCommands.syncs;

import lombok.Getter;
import ru.feryafox.GLamp.GLamp;
import ru.feryafox.GLamp.GLampData.GLampCommands.LampCommand;
import ru.feryafox.GLamp.GLampData.GLampSettings;

/**
 * Команда "синхронизировать Settings"
 */
public class SyncSettingsCommand implements LampCommand {
    private final GLamp lamp;
    @Getter
    private GLampSettings result;

    public SyncSettingsCommand(GLamp lamp) {
        this.lamp = lamp;
    }

    @Override
    public void execute() {
        this.result = lamp.syncSettings();
    }

}
