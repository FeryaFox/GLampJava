package ru.feryafox.GLamp.GLampCommands.updates;

import ru.feryafox.GLamp.GLamp;
import ru.feryafox.GLamp.GLampCommands.LampCommand;
import ru.feryafox.GLamp.GLampData.GLampSettings;

/**
 * Команда "обновить настройки"
 */
public class UpdateSettingsCommand implements LampCommand {
    private final GLamp lamp;
    private final GLampSettings settings;

    public UpdateSettingsCommand(GLamp lamp, GLampSettings settings) {
        this.lamp = lamp;
        this.settings = settings;
    }

    @Override
    public void execute() {
        lamp.updateSettings(settings);
    }
}