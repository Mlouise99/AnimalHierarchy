//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
// Email Notification
        NotificationService email = new EmailNotification("mwlouise99@gmail.com");
        email.sendNotification("Welcome to our platform!");
//

        // SMS Notification
        NotificationService sms = new SMSNotification();
        sms.sendNotification("Your verification code is 123456.");

        // Push Notification (with device ID)
        NotificationService push = new PushNotification("device-001");
        push.sendNotification("New message received!");

        push.setDefaultPriority("High");
    }
}