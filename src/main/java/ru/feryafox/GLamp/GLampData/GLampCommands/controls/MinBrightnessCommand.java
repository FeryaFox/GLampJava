package ru.feryafox.GLamp.GLampData.GLampCommands.controls;

import ru.feryafox.GLamp.GLamp;
import ru.feryafox.GLamp.GLampData.GLampCommands.LampCommand;

/**
 * Команда "минимальная яркость"
 */
public class MinBrightnessCommand implements LampCommand {
    private final GLamp lamp;

    public MinBrightnessCommand(GLamp lamp) {
        this.lamp = lamp;
    }

    @Override
    public void execute() {
        lamp.minBrightness();
    }
}