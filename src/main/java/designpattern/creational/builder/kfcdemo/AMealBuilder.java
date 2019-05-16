package designpattern.creational.builder.kfcdemo;

/**
 * ConcreteBuilder（具体建造者）
 * 实现抽象接口，构建和装配各个部件。
 * A 方案
 */
public class AMealBuilder extends MealBuilder {

    @Override
    public void buildFood() {
        meal.setFood("汉堡");
    }

    @Override
    public void buildDrink() {
        meal.setDrink("可乐");
    }
}
