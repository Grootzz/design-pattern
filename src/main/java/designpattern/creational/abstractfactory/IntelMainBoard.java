package designpattern.creational.abstractfactory;

public class IntelMainBoard implements MainBoard {
    @Override
    public void assemble() {
        System.out.println("Intel MainBoard");
    }
}
