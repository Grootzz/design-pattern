package designpattern.creational.simplefactory;

/**
 * 简单工厂
 * 利用反射解决简单工厂每次增加新了产品类都要修改产品工厂的弊端
 */
public class ShapeFactory01 {

    /**
     * 使用getShape()返回一个shape对象
     *
     * @param shapeType
     * @return
     */
    public static Shape getShape(Class<? extends Shape> shapeType) {
        if (shapeType == null) {
            return null;
        }
        Object object = null;
        try {
            // 使用反射创建对象
            object = Class.forName(shapeType.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (Shape) object;
    }
}
