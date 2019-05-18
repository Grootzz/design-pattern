package designpattern.structural.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * 动态代理
 */
public class Client {
    public static void main(String[] args) {

        Winery winery = new Winery();
        InvocationHandler wineStore = new WineStore(winery);
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        Wine wineryProxy = (Wine) Proxy.newProxyInstance(Winery.class.getClassLoader(),
                Winery.class.getInterfaces(),
                wineStore);

        wineryProxy.sell();
        System.out.println(wineryProxy.getClass().getName());
    }
}
