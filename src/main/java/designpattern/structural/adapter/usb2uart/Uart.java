package designpattern.structural.adapter.usb2uart;

public class Uart implements DataInterface{
    @Override
    public void transform() {
        System.out.println("使用UART传输数据");
    }
}
