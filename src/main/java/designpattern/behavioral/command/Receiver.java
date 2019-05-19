package designpattern.behavioral.command;

/**
 * 接收者
 */
public class Receiver {
    public void actionA() {
        System.out.println(getClass().getSimpleName() + ": 执行命令 " + Thread.currentThread().getStackTrace()[1].getMethodName());
    }

    public void actionB() {
        System.out.println(getClass().getSimpleName() + ": 执行命令 " + Thread.currentThread().getStackTrace()[1].getMethodName());
    }
}
