package designpattern.structural.adapter.usb2uart;

/**
 * 适配器模式
 * <p>
 * USB 适配到 UART
 */
public class Client {

    public static void main(String[] args) {
        // 将usb通过uart适配器进行适配
        DataInterface uart = new UartAdapter(new Usb());
        // 使用uart传输数据，实际会通过适配器将数据通过usb传输
        uart.transform();
    }
}
