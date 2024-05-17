package abstractFactory;

public class EmailFactory implements NotificationFactory {
    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }

    @Override
    public Alert createAlert() {
        return new EmailAlert();
    }
}