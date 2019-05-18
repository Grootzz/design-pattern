package designpattern.behavioral.template.common;

/**
 * 抽象逻辑模板
 */
public abstract class AbstractTemplate {

    public abstract void actionA();

    public abstract void actionB();

    public abstract void actionC();

    /**
     * 定义为final，防止子类覆写
     */
    public final void doSomething() {
        actionA();
        actionB();
        actionC();
    }
}
