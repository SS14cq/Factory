public class Sms implements Notification {

    @Override
    public void send(String message) {
        System.out.println("Enviando notificacion por " + message);;
    }
}
