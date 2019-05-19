package designpattern.behavioral.command;

/**
 * 客户类
 */
public class Client {
    public static void main(String[] args) {
        // 命令接受者
        Receiver receiver = new Receiver();
        // 创建命令
        ConcreteCommandA commandA = new ConcreteCommandA(receiver);
        ConcreteCommandB commandB = new ConcreteCommandB(receiver);

        // 创建命令发送者
        Invoker invoker = new Invoker();
        invoker.addCommand(commandA);
        invoker.addCommand(commandB);
        // 发送命令
        invoker.call();
    }
}
