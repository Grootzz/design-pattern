package designpattern.creational.abstractfactory;

public class AmdDisk implements Disk {
    @Override
    public void store() {
        System.out.println("AMD Disk");
    }
}
