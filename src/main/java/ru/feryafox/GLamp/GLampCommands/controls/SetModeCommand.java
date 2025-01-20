package ru.feryafox.GLamp.GLampCommands.controls;

import ru.feryafox.GLamp.GLamp;
import ru.feryafox.GLamp.GLampCommands.LampCommand;

/**
 * Команда "установить режим (по индексу)"
 */
public class SetModeCommand implements LampCommand {
    private final GLamp lamp;
    private final int modeIndex;

    public SetModeCommand(GLamp lamp, int modeIndex) {
        this.lamp = lamp;
        this.modeIndex = modeIndex;
    }

    @Override
    public void execute() {
        lamp.setMode(modeIndex);
    }
}
