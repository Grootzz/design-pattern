package designpattern.structural.proxy.dynamicproxy;

/**
 * 酒厂
 */
public class Winery implements Wine {
    @Override
    public void sell() {
        System.out.println(this.getClass().getSimpleName() + ": 酒厂直销酒...");
    }
}
