package designpattern.structural.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class WineStore implements InvocationHandler {

    private Object object;

    public WineStore(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(this.getClass().getSimpleName() + ": 开始销售...");
        method.invoke(object, args);
        System.out.println(this.getClass().getSimpleName() + ": 结束销售...");
        return null;
    }
}
