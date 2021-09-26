package com.company.notification;

public class SMSNotification implements Notification {
	@Override
	public void sendNotification(NotificationModel notification) {
		System.out.println("SMS Notification is going \n" + notification + "\n");
	}
}
