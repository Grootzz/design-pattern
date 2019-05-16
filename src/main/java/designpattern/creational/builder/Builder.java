package designpattern.creational.builder;

public abstract class Builder {
    protected Product product = new Product();

    public abstract void buildPartA();
    public abstract void buildPartB();
    public abstract void buildPartC();

    public Product getProduct() {
        return product;
    }
}
