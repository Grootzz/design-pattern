package designpattern.behavioral.observer.carprice;

/**
 * 定义被观察对象所具有的接口（特征）
 */
public interface Observable {
    // 注册观察者
    public void registerObserver(Observer observer);

    // 移除观察者
    public void removeObserver(Observer observer);

    // 通知所有观察者
    public void notifyObservers();
}
