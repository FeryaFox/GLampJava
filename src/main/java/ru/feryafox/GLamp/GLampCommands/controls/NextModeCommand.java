package ru.feryafox.GLamp.GLampCommands.controls;

import ru.feryafox.GLamp.GLamp;
import ru.feryafox.GLamp.GLampCommands.LampCommand;

/**
 * Команда "следующий режим"
 */
public class NextModeCommand implements LampCommand {
    private final GLamp lamp;

    public NextModeCommand(GLamp lamp) {
        this.lamp = lamp;
    }

    @Override
    public void execute() {
        lamp.nextMode();
    }
}
