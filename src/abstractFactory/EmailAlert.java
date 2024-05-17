package abstractFactory;

public class EmailAlert implements Alert {
    @Override
    public void sendAlert() {
        System.out.println("Sending an email alert.");
    }
}