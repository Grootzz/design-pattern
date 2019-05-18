package designpattern.structural.proxy.staticproxy;

/**
 * 酒厂代理
 */
public class WineryProxy implements Wine {

    private Wine wine;

    public WineryProxy(Wine wine) {
        this.wine = wine;
    }

    @Override
    public void sell() {
        System.out.println(this.getClass().getSimpleName() + ": 增加一点门面费");
        wine.sell();
        System.out.println(this.getClass().getSimpleName() + ": 卖出");
    }
}
