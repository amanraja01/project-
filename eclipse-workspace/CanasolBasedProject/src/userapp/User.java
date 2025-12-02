package userapp;

public class User {
	private String username;
	private String password;
	private String email;

//	constructor
	public User(String username, String email, String password) {
		this.username=username;
		this.password=password;
		this.email=email;
	}
	
//	getters
	public String getusername(){
     return username;		
	}
	
	public String getpassword (){
	     return password;		
		}
	
	public String grtemail (){
	     return email;		
		}

	


}
