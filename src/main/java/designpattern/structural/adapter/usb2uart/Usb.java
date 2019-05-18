package designpattern.structural.adapter.usb2uart;

public class Usb implements DataInterface {
    @Override
    public void transform() {
        System.out.println("使用USB传输数据");
    }
}
