package designpattern.structural.adapter.dataline;

public class M4DataLine implements Target {
    @Override
    public void connection() {
        System.out.println("使用小米4数据线连接...");
    }
}
