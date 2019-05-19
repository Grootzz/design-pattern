package designpattern.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * 调用者
 */
public class Invoker {
    private List<Command> commandList;

    public Invoker() {
        commandList = new ArrayList<>();
    }

    public void addCommand(Command command) {
        commandList.add(command);
    }

    public void call() {
        for (Command command : commandList) {
            command.execute();
        }
    }
}
