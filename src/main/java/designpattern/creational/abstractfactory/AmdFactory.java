package designpattern.creational.abstractfactory;

public class AmdFactory implements Factory {
    @Override
    public CPU makeCPU() {
        return new AmdCPU();
    }

    @Override
    public MainBoard makeMainBoard() {
        return new AmdMainBoard();
    }

    @Override
    public Disk makeDisk() {
        return new AmdDisk();
    }
}
