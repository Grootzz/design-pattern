package designpattern.behavioral.template.game;

/**
 * 模板方法
 */
public class Client {
    public static void main(String[] args) {
        Game game = new ShotGame();
        game.play();

        game = new CarGame();
        game.play();
    }
}
