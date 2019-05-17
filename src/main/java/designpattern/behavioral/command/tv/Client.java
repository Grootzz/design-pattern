package designpattern.behavioral.command.tv;

/**
 * 电视机遥控器
 * 电视机是请求的接收者，遥控器是请求的发送者，遥控器上有一些按钮，不同的按钮对应电视机的不同操作。
 * 抽象命令角色由一个命令接口来扮演，有三个具体的命令类实现了抽象命令接口，这三个具体命令类分别代表三种操作：打开电视机、关闭电视机和切换频道。
 * 显然，电视机遥控器就是一个典型的命令模式应用实例。
 */
public class Client {
    public static void main(String[] args) {
        // 命令接收者
        Televation televation = new Televation();

        // 具体命令
        TVOpenCommand tvOpenCommand = new TVOpenCommand(televation);
        TVOffCommand tvOffCommand = new TVOffCommand(televation);

        // 调用者
        Controller controller = new Controller();

        // 调用者获取命令
        controller.takeCommond(tvOpenCommand);
        controller.takeCommond(tvOffCommand);

        // 调用者发送命令
        controller.sendCommond();
    }
}
