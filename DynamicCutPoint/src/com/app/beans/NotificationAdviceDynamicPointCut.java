package com.app.beans;

import java.lang.reflect.Method;

import org.springframework.aop.support.DynamicMethodMatcherPointcut;

public class NotificationAdviceDynamicPointCut extends DynamicMethodMatcherPointcut{

	@Override
	public boolean matches(Method method, Class<?> classType, Object[] args) {
		double a= (Double)args[3];
		
		if(method.getName().equals("pay")|| classType.isAssignableFrom(NotificationAdvice.class)) {
			if(a>100) {
				
				return true;
			}
		}
		
		return false;
	}

}
