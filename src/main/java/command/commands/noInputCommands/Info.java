package command.commands.noInputCommands;

import command.Command;
import command.commands.Invoker;

import java.io.IOException;

public class Info extends Invoker {

    private Command getInfoCommand;
    private static final String COMMAND_NAME = Info.class.getSimpleName();

    public Info(Command getInfoCommand) {
        this.getInfoCommand = getInfoCommand;
    }

    public static String getCommandName() {
        return COMMAND_NAME;
    }

    @Override
    public void doCommand(String e) throws IOException {
        getInfoCommand.execute();
    }


}
