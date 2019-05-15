package designpattern.creational.singleton;

/**
 * 懒汉式(双重检查加锁版本)
 */
public class Singleton3 {

    private static Singleton3 unique = null;

    private Singleton3() {
    }

    /**
     * 没有加入synchronized关键字,是线程不安全的
     * 但是因为引入了synchronized锁，所以，获取锁会有额外的开销
     *
     * @return
     */
    public static synchronized Singleton3 getInstance() {
        // 判断当前单例是否已经存在，若存在则返回，不存在则再建立单例
        if (unique == null) {
            unique = new Singleton3();
        }
        return unique;
    }
}
