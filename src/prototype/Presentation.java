package prototype;

public class Presentation implements Document {
    @Override
    public void print() {
        System.out.println("Printing Presentation document.");
    }

    @Override
    public Document copy() {
        return new Presentation();
    }
}