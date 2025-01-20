package ru.feryafox.GLamp.GLampData.GLampCommands.updates;

import ru.feryafox.GLamp.GLamp;
import ru.feryafox.GLamp.GLampData.GLampCommands.LampCommand;
import ru.feryafox.GLamp.GLampData.GLampPalette;

/**
 * Команда "установить палитру"
 */
public class SetPaletteCommand implements LampCommand {
    private final GLamp lamp;
    private final GLampPalette palette;

    public SetPaletteCommand(GLamp lamp, GLampPalette palette) {
        this.lamp = lamp;
        this.palette = palette;
    }

    @Override
    public void execute() {
        lamp.setPalette(palette);
    }
}
