package designpattern.behavioral.observer.carprice;

import java.util.ArrayList;
import java.util.List;

public class Car implements Observable {

    // 被观察者维护的观察者列表
    private List<Observer> observerList = new ArrayList<>();

    // 被观察者属性
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        // 修改价格时，通知所有的观察者，被观察对象状态发生改变
        this.price = price;
        this.notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        // 注册观察者
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        // 取消观察者
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        // 实现通知所有的观察者对象
        for (Observer observer : observerList) {
            observer.doUpdate(price);
        }
    }
}
