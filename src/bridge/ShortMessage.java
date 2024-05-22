package bridge;

public class ShortMessage extends Message {
    public ShortMessage(MessageSender messageSender) {
        super(messageSender);
    }

    @Override
    public void send(String message) {
        if (message.length() <= 50) {
            messageSender.sendMessage(message);
        } else {
            System.out.println("Error: Short message length exceeded!");
        }
    }
}