package com.ba.beans;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

import com.ba.helper.Authentication;

public class SequritAdvice implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] arg, Object target) throws Throwable {
		Authentication au = null;
		au = Authentication.getinsatnce();
		if(au.authentcate()==false) {
			throw new IllegalArgumentException(" user name /pws not matched");
		}
	}

}
