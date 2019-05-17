package designpattern.behavioral.template;

public abstract class Game {
    abstract void start();
    abstract void playing();
    abstract void stop();

    public final void play(){
        start();
        playing();
        stop();
    }
}
