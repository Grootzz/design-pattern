package designpattern.creational.singleton;

/**
 * 懒汉式（synchronized关键字线程安全版本）
 */
public class Singleton4 {

    /**
     * volatile防止指令重排序（多线程情形，指令重排序会引发线程安全问题）
     */
    private static volatile Singleton4 unique = null;

    private Singleton4() {
    }

    /**
     * 没有加入synchronized关键字,是线程不安全的
     * 但是因为引入了synchronized锁，所以，获取锁会有额外的开销
     *
     * @return
     */
    public static Singleton4 getInstance() {
        // 判断当前单例是否已经存在，若存在则返回，不存在则再建立单例
        if (unique == null) {
            synchronized (Singleton4.class){
                if (unique == null) {
                    unique = new Singleton4();
                }
            }
        }
        return unique;
    }
}
