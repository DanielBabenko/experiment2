package command.inputCmdCollection;

import command.Command;
import command.ElementCommand;
import command.HelperController;
import command.UpdateCommand;
import command.commands.*;
import command.commands.inputCommands.*;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

public class InputCommands {
    private Map<String, Invoker> inputCommands = new HashMap<>();
    private HelperController helperController;

    //private HelperController helperController = new HelperController();

    public InputCommands(HelperController helperController) throws FileNotFoundException {
        this.helperController = helperController;

        //создаём команды и объекты всех наших input - команд

        UpdateCommand updateEl = new UpdateElementCommand(helperController);
        Update update = new Update(updateEl);

        RemoveById removeEl = new RemoveById(helperController);

        ExecuteScript executeScript = new ExecuteScript(helperController);

        //добавляем сюда все команды без входных элементов

        inputCommands.put(removeEl.getCommandName(), removeEl);
        inputCommands.put(update.getCommandName(), update);
        inputCommands.put(executeScript.getCOMMAND_NAME(), executeScript);
    }

    public Map<String, Invoker> getInputCommands() {
        return inputCommands;
    }



    public HelperController getHelperController() {
        return helperController;
    }

    public void setHelperController(HelperController helperController) {
        this.helperController = helperController;
    }
}
