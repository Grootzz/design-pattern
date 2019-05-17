package designpattern.behavioral.command.tv;

import java.util.LinkedList;
import java.util.List;

/**
 * 调用者（遥控器）
 */
public class Controller {
    /**
     * 用于存储命令
     */
    private List<Command> commandList = new LinkedList<>();

    public void takeCommond(Command command) {
        commandList.add(command);
    }

    public void sendCommond() {
        for (Command command : commandList) {
            command.execute();
        }
    }
}
