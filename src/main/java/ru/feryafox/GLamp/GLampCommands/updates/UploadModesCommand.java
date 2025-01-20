package ru.feryafox.GLamp.GLampCommands.updates;

import ru.feryafox.GLamp.GLamp;
import ru.feryafox.GLamp.GLampCommands.LampCommand;
import ru.feryafox.GLamp.GLampData.GLampModes;

/**
 * Команда "загрузить (обновить) список режимов"
 */
public class UploadModesCommand implements LampCommand {
    private final GLamp lamp;
    private final GLampModes modes;

    public UploadModesCommand(GLamp lamp, GLampModes modes) {
        this.lamp = lamp;
        this.modes = modes;
    }

    @Override
    public void execute() {
        lamp.uploadModes(modes);
    }
}