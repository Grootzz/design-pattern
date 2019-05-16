package designpattern.creational.builder.kfcdemo;

/**
 * Director（指挥者）
 * 构建一个使用Builder接口的对象。
 * 它主要是用于创建一个复杂的对象，它主要有两个作用：
 * 一是：隔离了客户与对象的生产过程；
 * 二是：负责控制产品对象的生产过程。
 */
public class KFCWaiter {

    private MealBuilder builder;

    public KFCWaiter(MealBuilder builder) {
        this.builder = builder;
    }

    public Meal contract() {
        // 准备食物
        builder.buildFood();
        // 准备饮料
        builder.buildDrink();

        // 准备完毕，返回给客户一个套餐方案
        return builder.getMeal();
    }
}
