package command.commands.noInputCommands;

import command.Command;
import command.commands.Invoker;

import java.io.IOException;
import java.text.ParseException;

public class Clear extends Invoker {
    private Command clearUpCommand;
    private static final String COMMAND_NAME = Clear.class.getSimpleName();


    public static String getCommandName() {
        return COMMAND_NAME;
    }


    public Clear(Command clearUpCommand){
        this.clearUpCommand = clearUpCommand;
    }

    public void clear() throws IOException, ParseException {
        clearUpCommand.execute();
    }

    @Override
    public void doCommand(String e) throws IOException, ParseException {
        clearUpCommand.execute();
    }
}
