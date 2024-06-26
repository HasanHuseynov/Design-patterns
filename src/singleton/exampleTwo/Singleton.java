package singleton.exampleTwo;

public class Singleton {
    private static Singleton instance;
    private Singleton() {
    }
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
    public void print() {
        System.out.println("Singleton instance is doing something.");
    }
}
