package designpattern.creational.simplefactory;

/**
 * 简单工厂
 */
public class ShapeFactory {

    /**
     * 使用getShape()返回一个shape对象
     *
     * @param shapeType
     * @return
     */
    public static Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE"))
            return new CircleShape();
        else if (shapeType.equalsIgnoreCase("RECTANGLE"))
            return new RectangleShape();
        return null;
    }
}
