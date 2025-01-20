package ru.feryafox.GLamp.GLampCommands.controls;

import ru.feryafox.GLamp.GLamp;
import ru.feryafox.GLamp.GLampCommands.LampCommand;

/**
 * Команда "обновить прошивку лампы"
 */
public class FirmwareUpdateCommand implements LampCommand {
    private final GLamp lamp;

    public FirmwareUpdateCommand(GLamp lamp) {
        this.lamp = lamp;
    }

    @Override
    public void execute() {
        lamp.firmwareUpdate();
    }
}
