package designpattern.structural.adapter.dataline;

public class M5DataLine implements Target{
    @Override
    public void connection() {
        System.out.println("使用小米5数据线连接...");
    }
}
