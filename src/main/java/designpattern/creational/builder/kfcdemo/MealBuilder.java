package designpattern.creational.builder.kfcdemo;

/**
 * Builder（抽象建造者）
 * 创建一个Product对象的各个部件指定的抽象接口。
 */
public abstract class MealBuilder {
    // 本类及其子类才可以用
    protected Meal meal = new Meal();

    public abstract void buildFood();

    public abstract void buildDrink();

    public Meal getMeal() {
        return meal;
    }
}
