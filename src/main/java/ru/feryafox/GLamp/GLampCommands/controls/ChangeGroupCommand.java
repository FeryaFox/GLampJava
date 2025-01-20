package ru.feryafox.GLamp.GLampCommands.controls;

import ru.feryafox.GLamp.GLamp;
import ru.feryafox.GLamp.GLampCommands.LampCommand;

/**
 * Команда "сменить группу лампы"
 */
public class ChangeGroupCommand implements LampCommand {
    private final GLamp lamp;
    private final int groupNumber;

    public ChangeGroupCommand(GLamp lamp, int groupNumber) {
        this.lamp = lamp;
        this.groupNumber = groupNumber;
    }

    @Override
    public void execute() {
        lamp.changeGroup(groupNumber);
    }
}
