package designpattern.behavioral.iterator;

/**
 * 迭代器
 *
 * @param <T>
 */
public interface Iterator<T> {
    boolean hasNext();

    T next();
}
