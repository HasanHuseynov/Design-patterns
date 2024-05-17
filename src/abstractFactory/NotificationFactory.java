package abstractFactory;

public interface NotificationFactory {
    Notification createNotification();
    Alert createAlert();
}
