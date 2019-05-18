package designpattern.behavioral.template.common;

/**
 * 抽象类的具体实现
 */
public class ConcretedActionImpl extends AbstractTemplate {
    @Override
    public void actionA() {
        System.out.println(this.getClass().getSimpleName() + ": actionA()");
    }

    @Override
    public void actionB() {
        System.out.println(this.getClass().getSimpleName() + ": actionB()");
    }

    @Override
    public void actionC() {
        System.out.println(this.getClass().getSimpleName() + ": actionC()");
    }
}
