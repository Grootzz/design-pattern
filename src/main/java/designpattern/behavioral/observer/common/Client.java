package designpattern.behavioral.observer.common;

/**
 * 观察者模式：通用逻辑
 */
public class Client {
    public static void main(String[] args) {
        // 创建主题
        Subject subject = new Subject();
        // 绑定监听
        subject.attach(new AObserver());
        subject.attach(new BObserver());
        subject.attach(new CObserver());

        // 发布主题
        subject.publish();
    }
}
