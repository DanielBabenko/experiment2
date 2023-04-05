package command.commands.noInputCommands.help;


import command.Command;
import command.commands.Invoker;

import java.io.IOException;

public class Help extends Invoker {
    private Command getHelpCommand;
    private static final String COMMAND_NAME = Help.class.getSimpleName();

    public static String getCommandName() {
        return COMMAND_NAME;
    }
    public Help(Command getHelpCommand){
        this.getHelpCommand = getHelpCommand;
    }


    @Override
    public void doCommand(String e) throws IOException {
        getHelpCommand.execute();
    }
}
