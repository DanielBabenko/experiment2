package command.commands.noInputCommands;


import command.Command;
import command.commands.Invoker;

import java.io.IOException;

public class SortedTiW extends Invoker {
    private Command sortTiW;
    private static final String COMMAND_NAME = "PrintFieldAscendingTunedInWorks";


    public static String getCommandName() {
        return COMMAND_NAME;
    }


    public SortedTiW(Command sortTiW){
        this.sortTiW = sortTiW;
    }

    public void printFieldAscendingTunedInWorks() throws IOException {
        sortTiW.execute();
    }

    @Override
    public void doCommand(String e) throws IOException {
        sortTiW.execute();
    }
}
