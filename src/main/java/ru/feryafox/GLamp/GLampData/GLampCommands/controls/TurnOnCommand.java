package ru.feryafox.GLamp.GLampData.GLampCommands.controls;

import ru.feryafox.GLamp.GLamp;
import ru.feryafox.GLamp.GLampData.GLampCommands.LampCommand;

/**
 * Команда включения лампы
 */
public class TurnOnCommand implements LampCommand {
    private final GLamp lamp;

    public TurnOnCommand(GLamp lamp) {
        this.lamp = lamp;
    }

    @Override
    public void execute() {
        lamp.turnOn();
    }
}