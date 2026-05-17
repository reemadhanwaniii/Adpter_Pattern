package Example4;

public class EmailNotification implements Notification {

    @Override
    public void sendNotification(String msg) {
//        logic to send email notification
        System.out.println("Email Notification : "+msg);
    }
}
