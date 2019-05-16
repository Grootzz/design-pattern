package designpattern.creational.simplefactory;

/**
 * 客户端调用
 * 简单工厂模式测试
 */
public class APP {
    public static void main(String[] args) {
        // 获取circle对象
        Shape circle = ShapeFactory.getShape("CIRCLE");
        circle.draw();

        // 获取rectangle对象
        Shape rectangle = ShapeFactory.getShape("rectangle");
        rectangle.draw();
    }
}
