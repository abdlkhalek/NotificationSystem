package com.ourteamnotification;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class MailSender {
	
	 String userName;
	 String password ;
	 String resiver;
	
	MailSender(String userName,String password,String resiver,Notification notification){
		this.userName = userName;
		this.password = password;
		this.resiver = resiver;
		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");
	
		Session session = Session.getInstance(props,
		  new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(userName, password);
			}
		  });
	
		try {
	
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(userName));
			message.setRecipient(Message.RecipientType.TO, new InternetAddress(resiver));
			message.setSubject("OurTeamMembersNotification");
			message.setText(notification.getNotificationContent());
	
			Transport.send(message);
			System.out.println("An email been sent successfully.");
			Notification.increaseSentNotification();
//			System.out.println("Done");
	
		} catch (MessagingException e) {
	//		throw new RuntimeException(e);
			System.out.println("Enter a valid Data dear");
			Notification.inrcraseUnsetNotification();
		}
	}
}

