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
		System.out.print("methodName:" + methhodName);
		System.out.print("argument:");
		for (int i = 0; i<args.length; i++) {
			if (i == 0) {
				System.out.print(args[i]);
				continue;
			}
			System.out.println("," + args[i]);
		}
		// modification point
	//	args[0] = (Integer) args[0] + 1;
		//args[1] = (Integer) args[1] + 1;

		ret = methodinvocation.proceed();
		// modification time
	//	ret = (Integer) ret + 5;
		return ret;
	}

}
