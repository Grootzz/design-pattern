package designpattern.structural.facade;

/**
 * 实现接口的实体类
 */
public class SquareShape implements Shape{
    @Override
    public void draw() {
        System.out.println("Shape: Square");
    }
}
