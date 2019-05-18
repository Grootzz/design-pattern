package designpattern.behavioral.observer.common;

public class AObserver implements Observer {
    @Override
    public void update() {
        System.out.println("A Observer receiving Subject update...");
    }
}
