public class Main {
    public static void main(String[] args) {
        SimpleNotificationFactory factory = new SimpleNotificationFactory();
        NotificationService service = new NotificationService(factory);

        service.sendNotification("email");
        service.sendNotification("sms");
        service.sendNotification("whatsapp");
    }
}
