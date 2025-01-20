package ru.feryafox.GLamp.GLampData.GLampCommands.syncs;

import lombok.Getter;
import ru.feryafox.GLamp.GLamp;
import ru.feryafox.GLamp.GLampData.GLampCommands.LampCommand;
import ru.feryafox.GLamp.GLampData.GLampModes;

/**
 * Команда "синхронизировать список модов"
 */
public class SyncModesCommand implements LampCommand {
    private final GLamp lamp;
    @Getter
    private GLampModes result;

    public SyncModesCommand(GLamp lamp) {
        this.lamp = lamp;
    }

    @Override
    public void execute() {
        this.result = lamp.syncModes();
    }

}
