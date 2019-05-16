package designpattern.structural.bridge;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class XMLUtilPen {
    public static Object getBean(String args) throws ParserConfigurationException, IOException, SAXException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        InputStream resource = XMLUtilPen.class.getClassLoader().getResourceAsStream("xml/configPen.xml");
        Document document = builder.parse(resource);
        NodeList nl = null;
        Node classNode = null;
        String cName = null;
        nl = document.getElementsByTagName("className");
        if (args.equals("color")) {
            classNode = nl.item(0).getFirstChild();
        } else if (args.equals("pen")) {
            classNode = nl.item(1).getFirstChild();
        }
        cName = classNode.getNodeValue();
        Class c = Class.forName(cName);
        Object instance = c.newInstance();
        return instance;
    }
}
