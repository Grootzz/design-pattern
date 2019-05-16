package designpattern.creational.factorymethod;

/**
 * 具体的产品
 */
public class CircleShape implements Shape{

    public CircleShape(){
        System.out.println("#designpattern.creational.simplefactory.CircleShape.CircleShape()");
    }
    @Override
    public void draw() {
        System.out.println("#designpattern.creational.simplefactory.CircleShape.draw()");
    }
}
