package designpattern.behavioral.strategy.arithmetic;

public class AddStrategy implements Strategy {

    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
