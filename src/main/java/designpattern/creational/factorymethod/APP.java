package designpattern.creational.factorymethod;

public class APP {
    public static void main(String[] args) {
        Factory factory = new CircleFactory();
        Shape circle = factory.getShape("CIRCLE");
        circle.draw();

        Factory rectangleFactory = new RectangleFactory();
        Shape rectangle = rectangleFactory.getShape("RECTANGLE");
        rectangle.draw();
    }
}
