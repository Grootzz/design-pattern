package designpattern.creational.abstractfactory;

public class IntelFactory implements Factory {
    @Override
    public CPU makeCPU() {
        return new IntelCPU();
    }

    @Override
    public MainBoard makeMainBoard() {
        return new IntelMainBoard();
    }

    @Override
    public Disk makeDisk() {
        return new IntelDisk();
    }
}
