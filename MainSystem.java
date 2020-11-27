package com.ourteamnotification;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class MainSystem {
	public static Notification notification;
	public static User normalUser;
	public static User admin;
	public static UserChecker checker;
	public static DataBase database = new UsersDataBase();//

//	database.addUser();
	public char input;
	public String email,password,name;
	public void defaultData() {
//		admin = new Admin("dev","dev","1234");//the fake mail will be added later
//		database.addUser(admin);
		database.addUser("justin","justinhold23@gmail.com","A123A123"); //the  
	}
	public Scanner scan= new Scanner(System.in);
	public  void execute() {
		System.out.println("1- Log in.\n2- Sign up.");
		normalUser = new NormalUser();
		input = scan.next().charAt(0);
		switch(input) {
			case '1' :
			{
				Scanner scan = new Scanner (System.in);
//				UserChecker checker= new UserChecker(); 
				System.out.print("email : "); //
				email = scan.nextLine();
				System.out.print("password : "); // 
				password = scan.nextLine();
				Login login = new Login();
				if (login.Log_in(name, email, password)) {
					normalUser.setEmail(email);
					normalUser.setPassword(password);
					normalUser.setName(name);
					System.out.println("Welcome " + normalUser.getName());
				}
				if (email.equals("ourteammembers2020@gmail.com") && password.equals("ourteammembers2020@@")) {
					admin = new Admin();
					admin.setName("admin");
					int menuNumber;
					while(true) {
					admin.menu();
					menuNumber = scan.nextInt();
					switch(menuNumber) {
						case 1 :
							((Admin) admin).create("new notification");
							break;
						case 2 :
							((Admin) admin).read();
							break;
						case 3:
							((Admin) admin).delete();
							break;
						case 4 :
							((Admin) admin).update();
							break;
						case 5:
							((Admin) admin).getStatistics();
							break;
						case 6:
							System.out.println("logged out");
							System.exit(0);
							break;
							default:
								System.out.println("Enter a valid number.");
								break;
					}
					
					}
				}
				else System.out.println("not Exist user try to sign up");
				break;
			}
			
			case '2': // sign up 
			{
				String n = scan.nextLine();
				System.out.println("Name : ");
				name = scan.nextLine();
				normalUser.setName(name);
				System.out.println("email : ");
				email = scan.nextLine();
				normalUser.setEmail(email);
				System.out.println("password : ");
				password = scan.nextLine();
				normalUser.setPassword(password);
				SignUp register = new SignUp(normalUser);
				if (register!=null) {
					notification = new RegisterNotification();
					notification.setNotificationContent("Thanks to Register With us.");
					MailSender sender = new MailSender("ourteammembers2020@gmail.com","ourteammembers2020@@",normalUser.getEmail(),notification);
				}
				break;
			}
		}
//			
		}
		
		
	
	public static void main(String[] args) throws IOException {
	MainSystem system = new MainSystem();
	system.defaultData();
	system.execute();
	
	}
	
}
