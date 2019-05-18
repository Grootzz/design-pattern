package designpattern.structural.adapter;

/**
 * 适配器模式
 * <p>
 * 将鸡适配为鸭
 */
public class Client {
    public static void main(String[] args) {
        // 有一只野鸡
        Cock cock = new WildCock();
        // 成功将野鸡适配成鸭
        Duck duck = new CockAdapter(cock);

        duck.fly();

        duck.quack();
    }
}
