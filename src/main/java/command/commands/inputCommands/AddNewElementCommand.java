package command.commands.inputCommands;

import command.Command;
import command.ElementCommand;
import command.HelperController;

import java.io.IOException;
import java.text.ParseException;

public class AddNewElementCommand implements Command {
    private HelperController helperController;

    public AddNewElementCommand(HelperController helperController) {
        this.helperController = helperController;
    }

    @Override
    public void execute() {
        try {
            helperController.addElement();
        } catch (IOException | ParseException ex) {
            throw new RuntimeException(ex);
        }
    }
}
