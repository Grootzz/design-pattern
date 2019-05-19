package designpattern.structural.decorator;

/**
 * 具体构件
 */
public class ConcreteComponent implements Component{
    @Override
    public void operation() {
        System.out.println(getClass().getSimpleName()+": Concreted component operation.");
    }
}
