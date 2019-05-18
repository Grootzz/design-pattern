package designpattern.creational.builder.kfcdemo;

public class Client {
    public static void main(String[] args) {
        MealBuilder builder = new AMealBuilder();
        // MealBuilder builder = new BMealBuilder();

        // 根据用户需求，注入不同的建造者，就可以不同的套餐方案（不同的组件配置方案）
        KFCWaiter waiter = new KFCWaiter(builder);

        // 客户接收到的具体方案
        Meal meal = waiter.contract();
        System.out.println(meal);
    }
}
