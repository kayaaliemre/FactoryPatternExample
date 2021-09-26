package com.company.notification;

public class EMailNotification implements Notification {
	@Override
	public void sendNotification(NotificationModel notification) {
		System.out.println("E-Mail Notification is going out\n" + notification + "\n");
	}
}
