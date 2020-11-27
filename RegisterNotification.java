package com.ourteamnotification;

public class RegisterNotification extends Notification{

	@Override
	public void setNotificationContent(String notificationContent) {
		this.notificationContent = notificationContent;
	}
	
	public String getNotificationContent() {
		return notificationContent;
	}
	
}
