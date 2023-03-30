package command.commands.inputCommands;


import command.Command;
import command.ElementCommand;
import command.HelperController;
import parser.Root;

public class RemoveLowerElementCommand implements Command {
    private HelperController helperController;

    public RemoveLowerElementCommand(HelperController helperController) {
        this.helperController = helperController;
    }

    @Override
    public void execute() {
        helperController.removeLower();
    }

}
