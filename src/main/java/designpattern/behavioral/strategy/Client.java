package designpattern.behavioral.strategy;

public class Client {
    // 使用 Context 来查看当它改变策略 Strategy 时的行为变化
    public static void main(String[] args) {
        Context context = new Context(new AddStrategy());
        System.out.println("f(10,5) = " + context.executeStrategy(10, 5));

        context = new Context(new SubstractStrategy());
        System.out.println("f(10,5) = " + context.executeStrategy(10, 5));

        context = new Context(new MultiplyStrategy());
        System.out.println("f(10,5) = " + context.executeStrategy(10, 5));
    }
}
