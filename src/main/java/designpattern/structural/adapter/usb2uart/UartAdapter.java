package designpattern.structural.adapter.usb2uart;

/**
 * Uart适配器
 *
 */
public class UartAdapter extends Uart {
    private DataInterface usb;

    public UartAdapter(DataInterface usb) {
        this.usb = usb;
    }

    @Override
    public void transform() {
        usb.transform();
    }
}
