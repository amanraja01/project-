package userapp;

import java.util.ArrayList;
import java.util.List;

public class UserService {
	
//	list to store registered user
	
	private List<User>users = new ArrayList<>();
	 
//	registration method
	
	
	public String registerUser(String username , String password, String email) {
//		check if userName already exists
		
		for (User user : users) {
			if(user.getusername().equalsIgnoreCase(username) ) {
				return "uername already taken please another ";
			}
 
		}
		//create and add new user
		   
	    users.add(new User(username,password,email));
	    
	    return "Regitration Successful";
	}  
// Login method	
public String loginUser(String username,String password ) {
	for(User user:users) {
		if(user.getusername().equalsIgnoreCase(username)  &&user.getpassword().equals(password)) {
			return "Login sccussful ! welcome,"+username;
		}
	}
	return "Invalid username or password";
}
//display all registered user(for demo)
public void showAll() {
	if(users.isEmpty()) {
		System.out.println("No registerd user yet");
	}
	else {
		System.out.println("\n---------Register------");
		for(User user:users) {
			System.out.println("user:"+user.getusername()+"Email:"+user.grtemail());
		}
	}
	
	
}
}
