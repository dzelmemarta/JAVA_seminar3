package model.users;

import java.security.MessageDigest;

public class RegisteredUser extends GuestUser{

	// 1. lokalie mainigie
	private String username;
	private String password;
	private String title; // privata lietotaja vards un uzvards, biznesam - nosaukums
	
	// 2. getters
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public String getTitle() {
		return title;
	}
	
	// 3. setters
	public void setUsername(String username) {
		if((username != null) && (!username.isEmpty()) && (username.matches("[A-Za-z0-9]{4,20"))) {
			this.username = username;
		}else {
			username = "defaultUser";
		}
	}
	public void setPassword(String password) throws Exception{
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(password.getBytes());
			this.password = md.digest().toString();
		}catch(Exception e) {
			// TODO
		}
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	// 4. non args
	// 5. args
	// 6. toString
	// 7. others
	
}
