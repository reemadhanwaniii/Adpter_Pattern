package Example4;

public class Main {
    static void main() {
        NotificationSender sender = new NotificationSender();
        sender.sendNotification("Hey your order is out for delivery","sms");
        sender.sendNotification("Hey your order is out for delivery","email");
        sender.sendNotification("Hey your order is out for delivery","push");
        sender.sendNotification("Hey your order is out for delivery","whatsapp");
        sender.sendNotification("Hey your order is out for delivery","slack");
    }
}
