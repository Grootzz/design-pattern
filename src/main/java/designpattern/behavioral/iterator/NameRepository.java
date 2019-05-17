package designpattern.behavioral.iterator;

public class NameRepository<T> implements Container {
    private String names[] = {"Robert", "John", "Julie", "Lora"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator<T> {
        private int index;

        @Override
        public boolean hasNext() {
            return index < names.length;
        }

        @Override
        public T next() {
            if (hasNext())
                return (T) names[index++];
            return null;
        }
    }
}
