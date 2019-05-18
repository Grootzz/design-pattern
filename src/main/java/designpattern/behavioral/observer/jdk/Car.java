package designpattern.behavioral.observer.jdk;

import java.util.Observable;

public class Car extends Observable {
    private double price;

    public Car(double price) {
        this.price = price;
    }

    public void setPrice(double price) {
        this.price = price;
        this.setChanged();//通知，数据已改变
        this.notifyObservers();
    }

    public double getPrice() {
        return price;
    }
}
