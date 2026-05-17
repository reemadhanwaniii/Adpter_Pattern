package Example4;

public class WhatsappNotificationAdapter implements Notification{
    private final WhatsappNotification notification;

    public WhatsappNotificationAdapter(WhatsappNotification notification) {
        this.notification = notification;
    }


    @Override
    public void sendNotification(String msg) {
        this.notification.sendWhatsappNotification(msg);
    }
}
