package abstractFactory;

public class SMSAlert implements Alert {
    @Override
    public void sendAlert() {
        System.out.println("Sending an SMS alert.");
    }
}