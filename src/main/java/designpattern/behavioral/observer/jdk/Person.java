package designpattern.behavioral.observer.jdk;

import java.util.Observable;
import java.util.Observer;

public class Person implements Observer {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof Car) {
            Car car = (Car) o;
            System.out.println(name + "，你好，你关注的车价已更新为：" + car.getPrice());
        }
    }
}
