package designpattern.creational.builder;

public class App {
    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        Product construct = director.construct();
    }
}
