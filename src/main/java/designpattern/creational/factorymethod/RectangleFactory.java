package designpattern.creational.factorymethod;

public class RectangleFactory implements Factory {
    @Override
    public Shape getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("RECTANGLE"))
            return new RectangleShape();
        else
            return null;
    }
}
