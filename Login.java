package com.ourteamnotification;

public class Login {
	UserChecker checker;
		  Login(){}
		public boolean Log_in(String name,String email,String password){
			checker = new UserChecker();
			if (checker.Userchecker(name,email,password)) { // check if the email exists
	//			if (!((UsersDataBase) database).getUser(email).equals("user Not Found")) {
					return true;
				} 
				else return false;	
	}
}
