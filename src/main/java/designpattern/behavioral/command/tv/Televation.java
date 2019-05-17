package designpattern.behavioral.command.tv;

/**
 * 命令接收者
 */
public class Televation {
    void open(){
        System.out.println("打开电视...");
    }

    void off(){
        System.out.println("关闭电视...");
    }
}
