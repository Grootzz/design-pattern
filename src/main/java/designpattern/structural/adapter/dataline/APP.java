package designpattern.structural.adapter.dataline;

public class APP {
    public static void main(String[] args) {
        // 将米4的数据线插入适配器，就可以使用Type-c接口
        Target target = new M5DataLineAdapter(new M4DataLine());
        target.connection();
    }
}
