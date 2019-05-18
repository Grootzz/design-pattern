package designpattern.behavioral.template.game;

/**
 * 实现类
 */
public class ShotGame extends Game {
    @Override
    void start() {
        System.out.println("shot start... ");
    }

    @Override
    void playing() {
        System.out.println("shot playing... ");
    }

    @Override
    void stop() {
        System.out.println("shot stop... ");
    }
}
