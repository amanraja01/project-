package userapp;

import java.util.Scanner;

public class MainApp { 
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		UserService us = new UserService();
        
		while(true) {
			System.out.println("\n----- User App menu---");
			System.out.println("1.Register");
			System.out.println("2.Login");
			System.out.println("3.Show All user (for demo) ");
			System.out.println("4.Eter Yuor Choice");
			
			int Choice=sc.nextInt();
			
			
			switch(Choice){
				case 1:
				System.out.println("Enter UserName");
				String username=sc.next();
				
				System.out.println("Enter the Password");
				String password=sc.next();
				
				System.out.println("Enter the Email");
				String email=sc.next();
				
				String regMsg =  us.registerUser(username, password, email);
				System.out.println(regMsg);
				break;
				
				case 2:
				System.out.println("Enter UserName");
				String uname=sc.next();
				
				System.out.println("Enter the Password");
				String pass=sc.next();
				
				String loginMsg=us.loginUser(uname, pass);
				System.out.println(loginMsg);
					break;
				case 3:
					us.showAll();
					break;
					
				case 4:
					System.out.println("Exting the Applicatin-------ThankYou");
					System.exit(0);
					default:
						System.out.println("Invalid choise please try Again");
					
				
				
			}
			
			
		}
	}

}
