package designpattern.structural.proxy.imageloading;

/**
 * 代理模式：图片加载
 */
public class Client {
    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");
        // 图像将从磁盘加载
        image.display();
        System.out.println("");
        // 图像不需要从磁盘加载
        image.display();
    }
}
