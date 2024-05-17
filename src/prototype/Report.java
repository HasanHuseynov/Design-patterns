package prototype;

public class Report implements Document {
    @Override
    public void print() {
        System.out.println("Printing Report document.");
    }

    @Override
    public Document copy() {
        return new Report();
    }
}