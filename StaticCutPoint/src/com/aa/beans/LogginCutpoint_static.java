package com.aa.beans;

import java.lang.reflect.Method;

import org.springframework.aop.support.StaticMethodMatcherPointcut;

public class LogginCutpoint_static extends StaticMethodMatcherPointcut{

	@Override
	public boolean matches(Method method, Class<?> classType) {
		
	if(method.getName().equals("multiply")&&classType.isAssignableFrom(Calculator.class))
	{
		return true;
	}
		return false;
	}

}
