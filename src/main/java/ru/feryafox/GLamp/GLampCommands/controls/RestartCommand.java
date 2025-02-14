package ru.feryafox.GLamp.GLampCommands.controls;

import ru.feryafox.GLamp.GLamp;
import ru.feryafox.GLamp.GLampCommands.LampCommand;

/**
 * Команда "перезагрузить лампу"
 */
public class RestartCommand implements LampCommand {
    private final GLamp lamp;

    public RestartCommand(GLamp lamp) {
        this.lamp = lamp;
    }

    @Override
    public void execute() {
        lamp.restart();
    }
}
