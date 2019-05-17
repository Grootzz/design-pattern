package designpattern.behavioral.vistor;

/**
 * 访问者模式
 */
public class Client {
    public static void main(String[] args) {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
