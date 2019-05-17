package designpattern.behavioral.template;

/**
 * 模板类
 */
public abstract class Game {
    abstract void start();

    abstract void playing();

    abstract void stop();

    /**
     * 定义为final防止子类重写
     */
    public final void play() {
        start();
        playing();
        stop();
    }
}
