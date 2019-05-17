package designpattern.behavioral.observer;

public class CObserver implements Observer {
    @Override
    public void update() {
        System.out.println("C Observer receiving Subject update...");
    }
}
