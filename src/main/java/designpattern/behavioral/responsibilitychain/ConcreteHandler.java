package designpattern.behavioral.responsibilitychain;

public class ConcreteHandler extends Handler {
    @Override
    public void handleRequest() {
        if (successor != null) {
            System.out.println("放过请求...");
            successor.handleRequest();
        } else {
            System.out.println("处理请求...");
        }
    }
}
