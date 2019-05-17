package designpattern.structural.decorator;

/**
 * 实现接口的实体类
 */
public class RectangleShape implements Shape{
    @Override
    public void draw() {
        System.out.println("Shape: Rectang");
    }
}
