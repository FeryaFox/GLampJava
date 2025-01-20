package ru.feryafox.GLamp.GLampCommands.controls;

import ru.feryafox.GLamp.GLamp;
import ru.feryafox.GLamp.GLampCommands.LampCommand;

/**
 * Команда "таймер на выключение"
 */
public class TurnOffTimerCommand implements LampCommand {
    private final GLamp lamp;
    private final int minutes;

    public TurnOffTimerCommand(GLamp lamp, int minutes) {
        this.lamp = lamp;
        this.minutes = minutes;
    }

    @Override
    public void execute() {
        lamp.turnOffTimer(minutes);
    }
}
