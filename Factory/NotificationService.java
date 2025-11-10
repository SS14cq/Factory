public class NotificationService {
    private SimpleNotificationFactory factory;

    public NotificationService(SimpleNotificationFactory factory) {
        this.factory = factory;
    }

    public void sendNotification(String type) {
        Notification notification = factory.createNotification(type);

        if (notification != null) {
            notification.send(type);
        } else {
            System.out.println("No se pudo crear la notificación.");
        }
    }
}
