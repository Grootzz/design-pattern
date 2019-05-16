package designpattern.creational.abstractfactory;

public interface Factory {
    CPU makeCPU();
    MainBoard makeMainBoard();
    Disk makeDisk();
}
