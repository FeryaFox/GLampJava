package ru.feryafox.GLamp.GLampData.GLampCommands.controls;

import ru.feryafox.GLamp.GLamp;
import ru.feryafox.GLamp.GLampData.GLampCommands.LampCommand;

/**
 * Команда "максимальная яркость"
 */
public class MaxBrightnessCommand implements LampCommand {
    private final GLamp lamp;

    public MaxBrightnessCommand(GLamp lamp) {
        this.lamp = lamp;
    }

    @Override
    public void execute() {
        lamp.maxBrightness();
    }
}