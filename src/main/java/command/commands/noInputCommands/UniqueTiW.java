package command.commands.noInputCommands;


import command.Command;
import command.commands.Invoker;

import java.io.IOException;

public class UniqueTiW extends Invoker {
    private Command printTiW;
    private static final String COMMAND_NAME = "PrintUniqueTunedInWorks";

    public static String getCommandName() {
        return COMMAND_NAME;
    }


    public UniqueTiW(Command printTiW){
        this.printTiW = printTiW;
    }

    public void printUniqueTunedInWorks() throws IOException {
        printTiW.execute();
    }

    @Override
    public void doCommand(String e) throws IOException {
        printTiW.execute();
    }
}
