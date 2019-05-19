package designpattern.structural.facade;

public class Facade {
    private SystemA systemA;
    private SystemB systemB;
    private SystemC systemC;

    public Facade() {
        this.systemA = new SystemA();
        this.systemB = new SystemB();
        this.systemC = new SystemC();
    }

    public void operationA(){
        systemA.operationA();
    }

    public void operationB(){
        systemB.operationB();
    }

    public void operationC(){
        systemC.operationC();
    }
}
