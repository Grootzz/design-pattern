package designpattern.structural.decorator;

public class ConcreteDecoratorA implements Decorator {

    private Component component;

    public ConcreteDecoratorA(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
    }

    /**
     * 装饰器之与包装组件的额外行为
     */
    public void addBehavior() {
        System.out.println(this.getClass().getSimpleName() + ": extra behavior.");
    }
}
