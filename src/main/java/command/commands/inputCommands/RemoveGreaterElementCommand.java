package command.commands.inputCommands;


import command.Command;
import command.ElementCommand;
import command.HelperController;

import java.io.IOException;

public class RemoveGreaterElementCommand implements Command {
    private HelperController helperController;

    public RemoveGreaterElementCommand(HelperController helperController) {
        this.helperController = helperController;
    }

    @Override
    public void execute(){
        helperController.removeGreater();
    }
}

