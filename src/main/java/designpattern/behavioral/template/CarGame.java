package designpattern.behavioral.template;

public class CarGame extends Game {
    @Override
    void start() {
        System.out.println("car start...");
    }

    @Override
    void playing() {
        System.out.println("car playing...");
    }

    @Override
    void stop() {
        System.out.println("car stop...");
    }
}
