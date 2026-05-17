package Example4;

public class NotificationSender {
    Notification notification;

    public void sendNotification(String msg,String notificationtype) {
        switch (notificationtype) {
            case "email" :
                notification = new EmailNotification();
                break;
            case "sms" :
                notification = new SMSNotification();
                break;
            case "push" :
                notification = new PushNotification();
                break;
            case "whatsapp" :
                notification = new WhatsappNotificationAdapter(new WhatsappNotification());
                break;
            case "slack" :
                notification = new SlackNotificationAdapter(new SlackNotification());
                break;
            default:
                System.out.println("Unsupported notification type");
                return;
        }
        notification.sendNotification(msg);
    }
}
