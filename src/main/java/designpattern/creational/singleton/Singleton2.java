package designpattern.creational.singleton;

/**
 * 懒汉式（非线程安全）
 */
public class Singleton2 {

    private static Singleton2 unique = null;

    private Singleton2() {
    }

    /**
     * 没有加入synchronized关键字,是线程不安全的
     *
     * @return
     */
    public static Singleton2 getInstance() {
        // 判断当前单例是否已经存在，若存在则返回，不存在则再建立单例
        if (unique == null) {
            unique = new Singleton2();
        }
        return unique;
    }
}
