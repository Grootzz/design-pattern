package designpattern.structural.proxy.staticproxy;

/**
 * 静态代理
 */
public class Client {
    public static void main(String[] args) {
        Wine wine = new Winery();
        wine.sell();

        System.out.println();

        Wine wineryProxy = new WineryProxy(wine);
        wineryProxy.sell();
    }
}
