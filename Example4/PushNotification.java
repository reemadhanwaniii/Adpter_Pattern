package Example4;

public class PushNotification implements Notification {

    @Override
    public void sendNotification(String msg) {
        System.out.println("Sending Push Notification : "+msg);
    }
}
