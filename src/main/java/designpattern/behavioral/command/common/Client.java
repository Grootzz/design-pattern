package designpattern.behavioral.command.common;

/**
 * 客户类
 */
public class Client {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();

        ConcreteCommand command = new ConcreteCommand(receiver);

        Invoker invoker = new Invoker(command);
        invoker.call();
    }
}
