package designpattern.structural.facade;

/**
 * 外观模式
 */
public class Client {
    public static void main(String[] args) {
        Facade facade = new Facade();

        facade.operationA();
        facade.operationB();
        facade.operationC();
    }
}
