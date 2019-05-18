package designpattern.behavioral.observer.common;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<Observer> observers = new ArrayList<>();

    /**
     * 主题的执行逻辑
     */
    public void publish(){
        System.out.println("do something...");
        notifyAllObservers();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    private void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }

}
