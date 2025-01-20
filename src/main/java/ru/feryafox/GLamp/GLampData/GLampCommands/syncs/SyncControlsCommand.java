package ru.feryafox.GLamp.GLampData.GLampCommands.syncs;

import lombok.Getter;
import ru.feryafox.GLamp.GLamp;
import ru.feryafox.GLamp.GLampData.GLampCommands.LampCommand;
import ru.feryafox.GLamp.GLampData.GLampControls;

/**
 * Команда "синхронизировать Controls"
 */
public class SyncControlsCommand implements LampCommand {
    private final GLamp lamp;
    @Getter
    private GLampControls result;

    public SyncControlsCommand(GLamp lamp) {
        this.lamp = lamp;
    }

    @Override
    public void execute() {
        this.result = lamp.syncControls();
    }

}
