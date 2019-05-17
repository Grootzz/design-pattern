package designpattern.behavioral.vistor;

public interface ComputerPartVisitor {
    void visit(Computer computer);

    void visit(Mouse mouse);

    void visit(KeyBoard keyboard);

    void visit(Monitor monitor);
}
