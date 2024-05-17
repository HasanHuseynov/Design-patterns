package factory;

public class FactoryPatternDemo {

    public static void main(String[] args) {
        NotificationFactory emailFactory = new EmailNotificationFactory();
        Notification emailNotification = emailFactory.createNotification();
        emailNotification.notifyUser();

        NotificationFactory smsFactory = new SMSNotificationFactory();
        Notification smsNotification = smsFactory.createNotification();
        smsNotification.notifyUser();
    }
}
