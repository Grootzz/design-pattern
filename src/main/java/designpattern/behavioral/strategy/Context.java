package designpattern.behavioral.strategy;

/**
 * 环境类，上下文
 */
public class Context {
    private Strategy strategy;

    public Context() {
    }

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 执行策略
     */
    public void executeStrategy() {
        strategy.algorithm();
    }
}
