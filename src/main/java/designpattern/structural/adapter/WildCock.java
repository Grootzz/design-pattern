package designpattern.structural.adapter;

public class WildCock implements Cock {
    @Override
    public void gobble() {
        System.out.println("鸡咕咕叫");
    }

    @Override
    public void fly() {
        System.out.println("鸡也会飞哦");
    }
}
