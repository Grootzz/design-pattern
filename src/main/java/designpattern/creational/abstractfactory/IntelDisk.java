package designpattern.creational.abstractfactory;

public class IntelDisk implements Disk {
    @Override
    public void store() {
        System.out.println("Intel Disk");
    }
}
