package com.ourteamnotification;

import java.util.ArrayList;

public interface DataBase {
	ArrayList<User>   users = new ArrayList<>();
	ArrayList<String> mailsToBeSent = new ArrayList<>();
	ArrayList<String> notifications = new ArrayList<>();
	public void addUser(String name , String email,String password);
	public void addUser(User user);
}
