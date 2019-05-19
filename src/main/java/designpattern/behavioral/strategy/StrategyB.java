package designpattern.behavioral.strategy;

public class StrategyB implements Strategy {
    @Override
    public void algorithm() {
        System.out.println(this.getClass().getSimpleName()+": do operation.");
    }
}
