package designpattern.behavioral.observer.common;

public class CObserver implements Observer {
    @Override
    public void update() {
        System.out.println("C Observer receiving Subject update...");
    }
}
