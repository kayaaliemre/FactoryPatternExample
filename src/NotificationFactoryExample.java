import com.company.notification.*;

public class NotificationFactoryExample {
    public static void main(String[] args) {
        NotificationModel smsNotification = new NotificationModel("905391231234", "905399876543", "I am sms message!");
        Notification smsNotificationFactory = new NotificationFactory().createNotification(SMSNotification.class);

        NotificationModel emailNotification = new NotificationModel("to.example@gmail.com", "from.example@gmail.com", "I am email message!");
        Notification emailNotificationFactory = new NotificationFactory().createNotification(EMailNotification.class);

        NotificationModel pushNotification = new NotificationModel("XXX909090", "YYY808080", "I am push message!");
        Notification pushNotificationFactory = new NotificationFactory().createNotification(PushNotification.class);

        smsNotificationFactory.sendNotification(smsNotification);
        emailNotificationFactory.sendNotification(emailNotification);
        pushNotificationFactory.sendNotification(pushNotification);
    }
}
