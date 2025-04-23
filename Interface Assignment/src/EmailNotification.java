public class EmailNotification implements NotificationService {
    private String emailAddress;

    public EmailNotification(String emailAddress) {

        if (!emailAddress.contains("@")) {
            throw new IllegalArgumentException("Invalid email address format");
        }
        this.emailAddress = emailAddress;
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("Sending email to " + emailAddress + ": " + message);
    }

}
