package com.ourteamnotification;

public class SignUp {
	
	DataBase data = new UsersDataBase();
	SignUp(){}
	SignUp(User user){
		data.addUser(user);
	}
	
}
