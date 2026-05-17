package Example4;

public class SlackNotificationAdapter implements Notification{

    private final SlackNotification notification;

    public SlackNotificationAdapter(SlackNotification notification) {
        this.notification = notification;
    }

    @Override
    public void sendNotification(String msg) {
        this.notification.sendSlackNotification(msg);
    }
}
