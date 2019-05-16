package designpattern.creational.abstractfactory;

public class AmdMainBoard implements MainBoard {
    @Override
    public void assemble() {
        System.out.println("AMD MainBoard");
    }
}
