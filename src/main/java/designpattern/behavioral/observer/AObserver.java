package designpattern.behavioral.observer;

public class AObserver implements Observer {
    @Override
    public void update() {
        System.out.println("A Observer receiving Subject update...");
    }
}
