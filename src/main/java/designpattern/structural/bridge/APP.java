package designpattern.structural.bridge;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class APP {
    public static void main(String[] args) throws SAXException, IllegalAccessException, IOException, InstantiationException, ParserConfigurationException, ClassNotFoundException {
        Color color;
        Pen pen;
        color = (Color) XMLUtilPen.getBean("color");
        pen = (Pen) XMLUtilPen.getBean("pen");
        pen.setColor(color);
        pen.draw("鲜花");
    }
}
