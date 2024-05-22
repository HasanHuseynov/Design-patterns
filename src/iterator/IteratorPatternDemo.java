package iterator;

public class IteratorPatternDemo {
    public static void main(String[] args) {
        IntegerCollection intCollection = new IntegerCollection(5);
        intCollection.addNumber(10);
        intCollection.addNumber(20);
        intCollection.addNumber(30);
        intCollection.addNumber(40);
        intCollection.addNumber(50);

        Iterator iterator = intCollection.createIterator();

        while (iterator.hasNext()) {
            int number = iterator.next();
            System.out.println("Number: " + number);
        }
    }
}

