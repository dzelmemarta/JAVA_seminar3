package model;

import java.time.LocalDateTime;

public class Post {
	// 1. lokalie mainigie
	private String msg;
	private LocalDateTime dateTime = LocalDateTime.now();
	private int countOfLikes = 0;
	
	// 2. un 3. getters un setters
	
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		if((msg != null) && (!msg.isEmpty()) && (msg.length() < 1000)) {
			this.msg = msg;
		}else {
			this.msg = "Unknown post";
		}
	}
	public LocalDateTime getDateTime() {
		return dateTime;
	}
	public void setDateTime() {
		dateTime = LocalDateTime.now();
	}
	public int getCountOfLikes() {
		return countOfLikes;
	}
	public void incrementCountOfLikes() {
		countOfLikes++;
	}
	
	// 4. non args
	
	public Post() {
		setMsg("Hello!");
	}
	
	// 5. args
	
	public Post(String msg) {
		setMsg(msg);
	}
	
	// 6. toString
	
	@Override
	public String toString() {
		return "message: " + msg + ", dateTime: " + dateTime + " countOfLikes: " + countOfLikes;
	}
	
	// 7. others
}
