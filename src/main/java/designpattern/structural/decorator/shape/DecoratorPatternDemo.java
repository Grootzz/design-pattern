package designpattern.structural.decorator.shape;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Shape circle = new CircleShape();
        Shape redCircle = new RedShapeDecorator(new CircleShape());
        Shape redRectangle = new RedShapeDecorator(new RectangleShape());

        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}
