package model.users;

public class GuestUser {
	
	// 1. lokalie maingie
	private long id;
	private static long counter = 1;
	
	// 2. getters un 3. setters
	public long getId() {
		return id;
	}
	public void setId() {
		this.id = counter++;
	}
	
	// 4. non args
	public GuestUser() {
		setId();
	}
	// argumenta konstruktos saja klase nav nepieciesams, jo nav dati no lietotaja puses
	
	// 5. toString
	public String toString() {
		String result = "" + id; // lai aprietu uz String tipu
		return result;
	}
	
	// 6. TODO

}
