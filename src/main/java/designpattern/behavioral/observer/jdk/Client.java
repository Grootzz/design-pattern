package designpattern.behavioral.observer.jdk;

/**
 * 通过JDK实现的观察者模式
 */
public class Client {
    public static void main(String[] args) {
        // 创建一个被观察对象
        Car car = new Car(50.0);
        // 创建两个观察者
        Person aa = new Person("AA");
        Person bb = new Person("BB");
        // 注册观察者到被观察对象
        car.addObserver(aa);
        car.addObserver(bb);

        // 第一轮更新
        // 被观察类状态改变
        car.setPrice(100.0);// 价格变动

        // 第二轮更新
        car.deleteObserver(aa);// 移除一个观察者
        car.setPrice(200.0);// 价格变动
    }
}
