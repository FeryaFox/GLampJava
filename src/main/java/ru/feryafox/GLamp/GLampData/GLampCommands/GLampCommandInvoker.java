package ru.feryafox.GLamp.GLampData.GLampCommands;

import java.util.ArrayList;
import java.util.List;

public class GLampCommandInvoker {
    private final List<LampCommand> commands = new ArrayList<>();

    public void addCommand(LampCommand command) {
        commands.add(command);
    }

    public void executeAll() {
        for (LampCommand command : commands) {
            command.execute();
        }
        commands.clear();
    }
}
