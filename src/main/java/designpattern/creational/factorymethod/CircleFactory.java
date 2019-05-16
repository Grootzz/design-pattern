package designpattern.creational.factorymethod;

public class CircleFactory implements Factory{
    @Override
    public Shape getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("CIRCLE"))
            return new CircleShape();
        else
            return null;
    }
}
