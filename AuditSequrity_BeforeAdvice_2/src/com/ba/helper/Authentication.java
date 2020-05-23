package com.ba.helper;

public class Authentication {
	private static Authentication instance;
	private ThreadLocal<User> localUser;
	private Authentication() {
		localUser=new ThreadLocal<>();
	}
	
	public static synchronized Authentication getinsatnce() {
		if(instance==null) {
			
			instance=new Authentication();
		}
		return instance;
	}
	
	
	public void login(String user, String pws) {
     
		User us=null;
     us=new User(user,pws);
     localUser.set(us);
     
	}
	
	
	public void logout() {
	localUser.set(null);	
	}
	
	public boolean authentcate() {
		User us=null;
	us=localUser.get();
	if(us!=null)
	{
		
		if(us.getUser().equals("uday")&&us.getPws().equals("uday1")) {
			
			return true;
		}
	}
		return false;
		
	}
}
