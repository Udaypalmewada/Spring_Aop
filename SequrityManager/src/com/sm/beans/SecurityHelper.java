package com.sm.beans;

public class SecurityHelper {

	private static SecurityHelper instance;

	private ThreadLocal<User> localuser;
	

	public void setLocaluser(ThreadLocal<User> localuser) {
		this.localuser = localuser;
	}

	private SecurityHelper() {

		localuser = new ThreadLocal<>();
	}

	public static  SecurityHelper gethelper() {
		if (instance == null) {

			instance = new SecurityHelper();
		}
		return instance;
	}

	public void login(String name, String pwd) {
		User user = null;
		user = new User(name, pwd);
		localuser.set(user);

		System.out.println("loged in");

	}
	public void logout() {
		localuser.set(null);
	}
	public boolean verified() {
		User user=null;
		user=localuser.get();
		if(user!=null) {
			
		}
			if(user.getName().equals("uday")&&user.getPwd().equals("uday1")) {
				
				return true;
		}
			return false;
	}

}
