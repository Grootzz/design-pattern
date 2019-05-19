package designpattern.structural.decorator;

public class ConcreteDecoratorB implements Decorator {

    private Component component;

    public ConcreteDecoratorB(Component component) {
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
