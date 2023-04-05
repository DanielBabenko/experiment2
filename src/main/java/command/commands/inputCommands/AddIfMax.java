package command.commands.inputCommands;


import command.Command;
import command.ElementCommand;
import command.commands.Invoker;
import model.LabWork;

import java.io.IOException;
import java.text.ParseException;

public class AddIfMax extends Invoker {
    private Command addMax;
    private static final String COMMAND_NAME = AddIfMax.class.getSimpleName();
  //  private static final String regex = "\\w*";


    public static String getCommandName() {
        return COMMAND_NAME;
    }

    public AddIfMax(Command addMax){
        this.addMax = addMax;
    }

    public void addIfMax(LabWork e){
        // addMax.execute(e);
    }

    @Override
    public void doCommand(String e) throws IOException, ParseException {
        addMax.execute();
    }
}
