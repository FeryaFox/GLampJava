package ru.feryafox.GLamp.GLampCommands.syncs;

import lombok.Getter;
import ru.feryafox.GLamp.GLamp;
import ru.feryafox.GLamp.GLampCommands.LampCommand;
import ru.feryafox.GLamp.GLampData.GLampDawn;

/**
 * Команда "синхронизировать рассвет (dawn)"
 */
public class SyncDawnCommand implements LampCommand {
    private final GLamp lamp;
    @Getter
    private GLampDawn result;

    public SyncDawnCommand(GLamp lamp) {
        this.lamp = lamp;
    }

    @Override
    public void execute() {
        this.result = lamp.syncDawn();
    }

}
