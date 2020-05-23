package com.aa.beans;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LoggingAdvice implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation methodinvocation) throws Throwable {
		String methhodName;
		Object[] args;
		Object ret = null;

		methhodName = methodinvocation.getMethod().getName();
		args = methodinvocation.getArguments();

		ret = methodinvocation.proceed();
		
		return ret;
	}

}
