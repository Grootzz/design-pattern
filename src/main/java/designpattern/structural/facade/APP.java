package designpattern.structural.facade;

/**
 * 客户端
 */
public class APP {
    public static void main(String[] args) {
        ShapeMaker maker = new ShapeMaker();

        maker.drawCircle();
        maker.drawRectangle();
        maker.drawSquare();
    }
}
