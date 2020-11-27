package com.ourteamnotification;

public  class User {

	protected String name,email,password;
	protected boolean isAdmin;
	User(){}
	User(String name,String email,String password){
		this.name = name;
		this.password = password;
		this.email = email;
		isAdmin = false;
	}
	
	public void menu(){} 
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public boolean getIsAdmin(){
		return isAdmin;
	}
}
