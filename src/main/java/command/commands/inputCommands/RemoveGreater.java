package command.commands.inputCommands;

import command.Command;
import command.commands.Invoker;

import java.io.IOException;
import java.text.ParseException;


public class RemoveGreater extends Invoker {

    private Command elementCommand;

    private static final String COMMAND_NAME = RemoveGreater.class.getSimpleName();

    public static String getCommandName() {
        return COMMAND_NAME;
    }


    public RemoveGreater(Command elementCommand) {
        this.elementCommand = elementCommand;
    }

    public void removeGreater() throws IOException, ParseException {
        this.elementCommand.execute();
    }

    @Override
    public void doCommand(String e) throws IOException, ParseException {
        //int i = Integer.parseInt(e.replaceAll("^\\D*?(-?\\d+).*$", "$1"));
        this.elementCommand.execute();
    }
}

