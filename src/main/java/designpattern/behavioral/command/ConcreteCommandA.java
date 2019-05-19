package designpattern.behavioral.command;

/**
 * 具体命令类（封装接受者的 actionA 行为）
 */
public class ConcreteCommandA implements Command {
    private Receiver receiver;

    public ConcreteCommandA(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.actionA();
    }
}
