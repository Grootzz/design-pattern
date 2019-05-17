package designpattern.behavioral.vistor;

public interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}
