package abstractFactory;

public class AbstractFactoryPatternDemo {

    public static void main(String[] args) {
        NotificationFactory emailFactory = new EmailFactory();
        Notification emailNotification = emailFactory.createNotification();
        Alert emailAlert = emailFactory.createAlert();

        emailNotification.notifyUser();
        emailAlert.sendAlert();

        NotificationFactory smsFactory = new SMSFactory();
        Notification smsNotification = smsFactory.createNotification();
        Alert smsAlert = smsFactory.createAlert();

        smsNotification.notifyUser();
        smsAlert.sendAlert();

    }
}
