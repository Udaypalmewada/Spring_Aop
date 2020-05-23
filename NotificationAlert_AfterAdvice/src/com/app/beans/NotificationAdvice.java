package com.app.beans;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

import org.springframework.aop.AfterReturningAdvice;

public class NotificationAdvice implements AfterReturningAdvice{

	@Override
	public void afterReturning(Object retval, Method method, Object[] args, Object target) throws Throwable {
		
	String sender=(String) args[0];
	String marchent=(String) args[1];
	String dis=(String) args[2];
	double ammount=(double) args[3];
		System.out.println("sender : "+sender+"\t marchent : "+marchent+"\t discription : "+dis+"\t amount : "+ammount);
	System.out.println(retval);
	}

}
