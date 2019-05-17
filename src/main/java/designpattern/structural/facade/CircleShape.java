package designpattern.structural.facade;

/**
 * 实现接口的实体类
 */
public class CircleShape implements Shape{
    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}
