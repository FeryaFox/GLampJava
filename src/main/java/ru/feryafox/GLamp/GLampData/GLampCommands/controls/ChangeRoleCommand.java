package ru.feryafox.GLamp.GLampData.GLampCommands.controls;

import ru.feryafox.GLamp.GLamp;
import ru.feryafox.GLamp.GLampData.GLampCommands.LampCommand;

/**
 * Команда "сменить роль лампы (Slave/Master)"
 */
public class ChangeRoleCommand implements LampCommand {
    private final GLamp lamp;
    private final int role; // 0 – Slave, 1 – Master

    public ChangeRoleCommand(GLamp lamp, int role) {
        this.lamp = lamp;
        this.role = role;
    }

    @Override
    public void execute() {
        lamp.changeRole(role);
    }
}
