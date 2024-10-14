package com.quizApp;

public class UserResponse {
	private String userName;
	private boolean userStatus;

	public UserResponse(String userName, boolean userStatus) {
		super();
		this.userName = userName;
		this.userStatus = userStatus;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public boolean isStatus() {
		return userStatus;
	}

	public void setStatus(boolean userStatus) {
		this.userStatus = userStatus;
	}

}
