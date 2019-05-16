package designpattern.structural.adapter;

public class CockAdapter implements Duck {
    /**
     * 需要注入一个cock对象来适配
     */
    private Cock cock;

    // 构造方法中需要一个鸡的实例，此类就是将这只鸡适配成鸭来用
    public CockAdapter(Cock cock) {
        this.cock = cock;
    }


    /**
     * 实现鸭的呱呱叫方法
     */
    @Override
    public void quack() {
        // 内部其实是一只鸡的咕咕叫
        cock.gobble();
    }


    @Override
    public void fly() {
        cock.fly();
    }
}
