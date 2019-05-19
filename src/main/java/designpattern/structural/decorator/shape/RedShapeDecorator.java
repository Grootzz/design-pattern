package designpattern.structural.decorator.shape;

/**
 * 具体的装饰类
 * 将附件功能写到装饰类中，定义为private
 */
public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        setRedBorder(decoratedShape);// 附加功能
        super.draw();
    }

    /**
     * 附加功能
     *
     * @param decoratedShape
     */
    private void setRedBorder(Shape decoratedShape) {
        System.out.println("Border Color: Red");
    }
}
