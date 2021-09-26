package com.company.notification;

public class NotificationFactory {
    public static <T extends Notification> T createNotification(Class<T> clazz) {
        try {
            return clazz.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            return null;
        }
    }
}
