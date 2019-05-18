package designpattern.structural.adapter.dataline;

/**
 * 适配器模式
 * <p>
 * 将 M4 的数据线通过适配器适配到 M5 的数据线
 */
public class Client {
    public static void main(String[] args) {
        // 将米4的数据线插入适配器，就可以使用Type-c接口
        Target target = new M5DataLineAdapter(new M4DataLine());
        target.connection();
    }
}
