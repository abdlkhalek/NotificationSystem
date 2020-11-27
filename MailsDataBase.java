	package com.ourteamnotification;

public class MailsDataBase implements DataBase{
	
	public void addMail(String mail) {
		mailsToBeSent.add(mail);
	}
	// dependency 

	@Override
	public void addUser(String name, String email, String password) {}//do nothing.

	@Override
	public void addUser(User user) {}
}
