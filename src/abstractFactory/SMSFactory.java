package abstractFactory;

public class SMSFactory implements NotificationFactory {
    @Override
    public Notification createNotification() {
        return new SMSNotification();
    }

    @Override
    public Alert createAlert() {
        return new SMSAlert();
    }
}
