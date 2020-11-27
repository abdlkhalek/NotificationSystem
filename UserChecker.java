package com.ourteamnotification;

public class UserChecker implements DataBase{

	UserChecker(){}
	public boolean Userchecker(String name ,String email,String password){
		for (User user:users) {
			if (user.email.equals(email) && user.password.equals(password)){
				name = user.getName();
				return true;
			}
		}
		return false;
	}
	@Override
	public void addUser(String name, String email, String password) {}
	@Override
	public void addUser(User user) {} 
	
}
