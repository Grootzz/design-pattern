package designpattern.structural.adapter;

public class APP {
    public static void main(String[] args) {
        // 有一只野鸡
        Cock cock = new WildCock();
        // 成功将野鸡适配成鸭
        Duck duck = new CockAdapter(cock);

        duck.fly();

        duck.quack();
    }
}
