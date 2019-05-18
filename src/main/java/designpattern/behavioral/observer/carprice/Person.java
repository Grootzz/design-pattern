package designpattern.behavioral.observer.carprice;

/**
 * 具体的观察者
 */
public class Person implements Observer {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public void doUpdate(Object args) {
        System.out.println(name + "，你好，你关注的车价已更新为：" + (Double) args);
    }
}
