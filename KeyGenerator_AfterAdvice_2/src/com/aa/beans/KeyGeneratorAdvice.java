package com.aa.beans;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class KeyGeneratorAdvice implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object retvalue, Method method, Object[] args, Object target) throws Throwable {
		int a=(int) args[0];
		if(a<0) {
			//System.out.println("key is weak");
			throw new IllegalArgumentException("key is weak");
		}
		else {
			System.out.println("key is stromg ");
		}
		
	}

}
