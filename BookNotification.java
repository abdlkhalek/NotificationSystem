package com.ourteamnotification;

public class BookNotification extends Notification{
	
	@Override
	public void setNotificationContent(String notificationContent) {
		this.notificationContent = notificationContent;
	}
	
	@Override
	public String getNotificationContent() {
		return notificationContent;
	}
	
}
