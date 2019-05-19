package designpattern.behavioral.strategy;

/**
 * 策略模式
 * 策略模式通用模板
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();

        context.setStrategy(new StrategyA());
        context.executeStrategy();

        context.setStrategy(new StrategyB());
        context.executeStrategy();
    }
}
