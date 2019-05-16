package designpattern.creational.abstractfactory;

public class IntelCPU implements CPU{
    @Override
    public void compute() {
        System.out.println("Intel CPU");
    }
}
