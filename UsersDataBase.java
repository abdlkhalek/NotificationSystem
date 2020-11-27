package com.ourteamnotification;

public class UsersDataBase implements DataBase{
	

	public void addUser(String name,String email,String password) {
		users.add(new User(name,email,password));
	}
	
	public void addUser(User newUser) {
		users.add(newUser);
	}
	public int getUser(User user) { // to get the index of user in the array .
		if (users.contains(user)) {
			return users.indexOf(user);
		}
		else return -1;
	}
}
