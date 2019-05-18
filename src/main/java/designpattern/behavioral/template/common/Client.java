package designpattern.behavioral.template.common;

/**
 * 模板模式：通用
 */
public class Client {
    public static void main(String[] args) {
        AbstractTemplate template = new ConcretedActionImpl();
        template.doSomething();

        AbstractTemplate template$ = new ConcretedActionImpl$();
        template$.doSomething();
    }
}
