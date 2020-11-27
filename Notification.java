package com.ourteamnotification;

public abstract class Notification {
	protected String notificationContent;
	protected static int unSuccessfulSentNotification=0;
	protected static int successfulSentNotification=0;
	public abstract void setNotificationContent(String notificationContent);
	public abstract String getNotificationContent();
	public static void increaseSentNotification() {
		successfulSentNotification++;
	}
	
	public static void inrcraseUnsetNotification() {
		unSuccessfulSentNotification++;
	}
	public static void statistics() {
		System.out.println("Unsuccessfull sent : " + unSuccessfulSentNotification + 
							"\nsuccessful Sent : " + successfulSentNotification);
	}
	
}
