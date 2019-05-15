package designpattern.creational.singleton;

/**
 * 懒汉式（登记式/静态内部类方式）
 * 静态内部实现的单例是懒加载的且线程安全。
 * 只有通过显式调用 getInstance 方法时，才会显式装载 SingletonHolder 类，
 * 从而实例化 instance（只有第一次使用这个单例的实例的时候才加载，同时不会有线程安全问题）。
 */
public class Singleton5 {
    private Singleton5() {
    }

    /**
     * 静态内部类中实例化
     */
    private static class SingletonHolder {
        private static final Singleton5 SINGLETON = new Singleton5();
    }

    public static final Singleton5 getInstance() {
        return SingletonHolder.SINGLETON;
    }
}
