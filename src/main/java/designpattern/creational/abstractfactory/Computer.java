package designpattern.creational.abstractfactory;

public class Computer {
    private CPU cpu;
    private MainBoard mainBoard;
    private Disk disk;

    public Computer(CPU cpu, MainBoard mainBoard, Disk disk) {
        this.cpu = cpu;
        this.mainBoard = mainBoard;
        this.disk = disk;
    }
}
