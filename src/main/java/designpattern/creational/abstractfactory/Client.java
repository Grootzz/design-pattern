package designpattern.creational.abstractfactory;

public class Client {
    public static void main(String[] args) {
        // 创建一个工厂用于生产产品的各个要素
        Factory intelFactory = new IntelFactory();
        // 通过工厂生产产品的各个要素
        CPU cpu = intelFactory.makeCPU();
        MainBoard mainBoard = intelFactory.makeMainBoard();
        Disk disk = intelFactory.makeDisk();
        // 组装产品
        Computer computer = new Computer(cpu, mainBoard, disk);

        /** 同理 */
        Factory amdFactory = new AmdFactory();

        CPU amdcpu = amdFactory.makeCPU();
        MainBoard amdmainBoard = amdFactory.makeMainBoard();
        Disk amddisk = amdFactory.makeDisk();

        Computer amdcomputer = new Computer(amdcpu, amdmainBoard, amddisk);
    }
}
