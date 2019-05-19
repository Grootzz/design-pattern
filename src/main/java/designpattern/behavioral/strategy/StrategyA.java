package designpattern.behavioral.strategy;

public class StrategyA implements Strategy{
    @Override
    public void algorithm() {
        System.out.println(this.getClass().getSimpleName()+": do operation.");
    }
}
