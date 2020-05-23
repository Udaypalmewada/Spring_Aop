package com.ba.helper;

public class User {
	private String user;
	private String pws;

	public User(String user, String pws) {
		this.user = user;
		this.pws = pws;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPws() {
		return pws;
	}

	public void setPws(String pws) {
		this.pws = pws;
	}

}
