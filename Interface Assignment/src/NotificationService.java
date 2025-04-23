public interface NotificationService {
    void sendNotification(String message);

    default void setDefaultPriority(String priority) {
        System.out.println("Default priority: " + priority);

    }




}
