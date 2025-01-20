package ru.feryafox.GLamp.GLampCommands.controls;

import ru.feryafox.GLamp.GLamp;
import ru.feryafox.GLamp.GLampCommands.LampCommand;

/**
 * Команда "предыдущий режим"
 */
public class PrevModeCommand implements LampCommand {
    private final GLamp lamp;

    public PrevModeCommand(GLamp lamp) {
        this.lamp = lamp;
    }

    @Override
    public void execute() {
        lamp.prevMode();
    }
}