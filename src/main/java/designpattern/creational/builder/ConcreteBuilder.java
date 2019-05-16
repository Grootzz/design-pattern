package designpattern.creational.builder;

public class ConcreteBuilder extends Builder {
    @Override
    public void buildPartA() {
        System.out.println("build part A");
    }

    @Override
    public void buildPartB() {
        System.out.println("build part B");
    }

    @Override
    public void buildPartC() {
        System.out.println("build part C");
    }
}
