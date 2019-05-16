package designpattern.creational.abstractfactory;

public class AmdCPU implements CPU {
    @Override
    public void compute() {
        System.out.println("AMD CPU");
    }
}
