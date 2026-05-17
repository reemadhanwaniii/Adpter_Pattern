package Example4;

public class SMSNotification implements Notification{

    @Override
    public void sendNotification(String msg) {
        System.out.println("Sending SMS Notification : "+ msg);
    }
}
