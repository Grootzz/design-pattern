package designpattern.behavioral.command;

/**
 * 具体命令类（封装接受者的 actionB 行为）
 */
public class ConcreteCommandB implements Command {
    private Receiver receiver;

    public ConcreteCommandB(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.actionB();
    }
}
