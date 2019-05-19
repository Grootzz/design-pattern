package designpattern.structural.facade.shape;

/**
 * 实现接口的实体类
 */
public class SquareShape implements Shape{
    @Override
    public void draw() {
        System.out.println("Shape: Square");
    }
}
