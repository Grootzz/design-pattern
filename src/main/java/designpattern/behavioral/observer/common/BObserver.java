package designpattern.behavioral.observer.common;

public class BObserver implements Observer {
    @Override
    public void update() {
        System.out.println("B Observer receiving Subject update...");
    }
}
