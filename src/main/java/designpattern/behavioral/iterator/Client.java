package designpattern.behavioral.iterator;

/**
 * 迭代器模式: 提供一种方法顺序访问一个聚合对象中各个元素, 而又无须暴露该对象的内部表示。
 */
public class Client {
    public static void main(String[] args) {
        NameRepository<String> nameRepository = new NameRepository<String>();
        Iterator iterator = nameRepository.getIterator();
        while (iterator.hasNext()) {
            Object name = iterator.next();
            System.out.println("Name: " + name);
        }
    }
}
