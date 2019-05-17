package designpattern.behavioral.observer;

public class BObserver implements Observer {
    @Override
    public void update() {
        System.out.println("B Observer receiving Subject update...");
    }
}
