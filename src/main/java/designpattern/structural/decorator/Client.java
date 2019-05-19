package designpattern.structural.decorator;

/**
 * 装饰器设计模式
 */
public class Client {
    public static void main(String[] args) {
        Component component =new ConcreteComponent();

        Component componentA = new ConcreteDecoratorA(component);
        componentA.operation();
        ((ConcreteDecoratorA)componentA).addBehavior();

        Component componentB = new ConcreteDecoratorB(component);
        componentB.operation();
        ((ConcreteDecoratorB)componentB).addBehavior();
    }
}
