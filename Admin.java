package com.ourteamnotification;

interface Read{
//	DataBase database = ();
	public void read();
}

interface Create{ // create 
	public void create(String newNotification);
}

 
interface Update{ // updatea
	public void update();
}

interface Delete{
	public void delete();
}

public class Admin extends User implements Read,Create,Update,Delete{
	
	Admin(){}
	Admin(String name , String email, String password){
		super(name,email,password);
		isAdmin=true;
		
	}
	public void menu() {
		System.out.println("1-creat a notification\n2-read notifications"
						+  "\n3-update Notification\n4-delete Notifications\n5-statistics.\n6- log out");
	}
	
	@Override
	public void create(String newNotification) {
		// TODO Auto-generated method stub
		
		
	}
	
	@Override
	public void read() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}
	
	public void getStatistics() {
		Notification.statistics();
	}
	
	
	
}
