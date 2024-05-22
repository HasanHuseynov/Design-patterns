package bridge;

public class BridgePatternDemo {
    public static void main(String[] args) {
        MessageSender emailSender = new EmailSender();
        MessageSender smsSender = new SMSSender();

        Message shortEmail = new ShortMessage(emailSender);
        Message longEmail = new LongMessage(emailSender);

        Message shortSMS = new ShortMessage(smsSender);
        Message longSMS = new LongMessage(smsSender);

        shortEmail.send("Hi there! This is a short email message.");
        longEmail.send("Hi there! This is a long email message that is definitely longer than fifty characters.");

        shortSMS.send("Hi! Short SMS.");
        longSMS.send("Hi! This is a long SMS message that is longer than fifty characters to demonstrate the long message functionality.");
    }
}
