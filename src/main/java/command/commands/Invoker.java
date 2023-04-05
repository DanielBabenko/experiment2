package command.commands;

import java.io.IOException;

//Это общий класс-наследник для всех инвокеров
public abstract class Invoker {
    //общий метод ля выполнения всех команд. Очень поможет нам для создания полиморфизма при вводе команд
    public abstract void doCommand(String e) throws IOException;
}
