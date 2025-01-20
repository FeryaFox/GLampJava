package ru.feryafox.GLamp.GLampCommands.syncs;


import lombok.Getter;
import ru.feryafox.GLamp.GLamp;
import ru.feryafox.GLamp.GLampCommands.LampCommand;
import ru.feryafox.GLamp.GLampData.GLampPalette;

/**
 * Команда "синхронизировать палитру"
 */
public class SyncPaletteCommand implements LampCommand {
    private final GLamp lamp;
    @Getter
    private GLampPalette result;

    public SyncPaletteCommand(GLamp lamp) {
        this.lamp = lamp;
    }

    @Override
    public void execute() {
        this.result = lamp.syncPalette();
    }
}