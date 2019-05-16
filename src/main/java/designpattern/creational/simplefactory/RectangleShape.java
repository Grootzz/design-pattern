package designpattern.creational.simplefactory;

public class RectangleShape implements Shape {
    public RectangleShape(){
        System.out.println("#designpattern.creational.simplefactory.RectangleShape.RectangleShape()");
    }

    @Override
    public void draw() {
        System.out.println("#designpattern.creational.simplefactory.RectangleShape.draw()");
    }
}
