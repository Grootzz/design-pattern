package designpattern.behavioral.template.game;

/**
 * 实现类
 */
public class CarGame extends Game {
    @Override
    void start() {
        System.out.println("game start...");
    }

    @Override
    void playing() {
        System.out.println("game playing...");
    }

    @Override
    void stop() {
        System.out.println("game stop...");
    }
}
