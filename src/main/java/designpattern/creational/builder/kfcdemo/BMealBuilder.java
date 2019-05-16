package designpattern.creational.builder.kfcdemo;

/**
 * ConcreteBuilder（具体建造者）
 * 实现抽象接口，构建和装配各个部件。
 * B 方案
 */
public class BMealBuilder extends MealBuilder {

    @Override
    public void buildFood() {
        meal.setFood("鸡翅");
    }

    @Override
    public void buildDrink() {
        meal.setDrink("果汁");
    }
}
