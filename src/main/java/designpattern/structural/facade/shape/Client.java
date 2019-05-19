package designpattern.structural.facade.shape;

/**
 * 外观模式
 * 形状示例
 */
public class Client {
    public static void main(String[] args) {
        ShapeMaker maker = new ShapeMaker();

        maker.drawCircle();
        maker.drawRectangle();
        maker.drawSquare();
    }
}
