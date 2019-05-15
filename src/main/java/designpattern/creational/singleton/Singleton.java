package designpattern.creational.singleton;

/**
 * 饿汉方式(线程安全)
 */
public class Singleton {

    /**
     * 在类加载阶段的 初始化阶段 创建实例
     * 因为 初始化阶段 的<clinit>()方法是线程安全的，所以这种方式创建对象线程安全
     */
    private static Singleton unique = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return unique;
    }
}
