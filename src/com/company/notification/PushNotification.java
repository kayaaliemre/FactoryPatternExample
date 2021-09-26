package com.company.notification;

public class PushNotification implements Notification {
    @Override
    public void sendNotification(NotificationModel notification) {
        System.out.println("Push Notification is going \n" + notification + "\n");
    }
}
