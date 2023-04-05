package command.commands.inputCommands;


import command.Command;
import command.ElementCommand;
import command.HelperController;
import parser.Root;

import java.io.IOException;

public class RemoveLowerElementCommand implements Command {
    private HelperController helperController;

    public RemoveLowerElementCommand(HelperController helperController) {
        this.helperController = helperController;
    }

    @Override
    public void execute() throws IOException {
        helperController.removeLower();
    }

}
