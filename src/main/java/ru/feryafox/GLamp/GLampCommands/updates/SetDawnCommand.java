package ru.feryafox.GLamp.GLampCommands.updates;

import ru.feryafox.GLamp.GLamp;
import ru.feryafox.GLamp.GLampCommands.LampCommand;
import ru.feryafox.GLamp.GLampData.GLampDawn;

/**
 * Команда "установить рассвет (GLampDawn)"
 */
public class SetDawnCommand implements LampCommand {
    private final GLamp lamp;
    private final GLampDawn dawn;

    public SetDawnCommand(GLamp lamp, GLampDawn dawn) {
        this.lamp = lamp;
        this.dawn = dawn;
    }

    @Override
    public void execute() {
        lamp.setDawn(dawn);
    }
}
