package iterator;

public class IntegerCollection {
    private int[] numbers;
    private int size = 0;

    public IntegerCollection(int capacity) {
        numbers = new int[capacity];
    }

    public void addNumber(int number) {
        if (size < numbers.length) {
            numbers[size++] = number;
        } else {
            System.out.println("Collection is full!");
        }
    }

    public Iterator createIterator() {
        return new IntegerIterator();
    }

    private class IntegerIterator implements Iterator {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < size;
        }

        @Override
        public int next() {
            if (hasNext()) {
                return numbers[index++];
            }
            return -1;
        }
    }
}
