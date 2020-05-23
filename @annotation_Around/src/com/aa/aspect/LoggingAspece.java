package com.aa.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAspece {
	@Around(value = "execution(* com.aa.beans.*.*(..))")
	public Object log(ProceedingJoinPoint pjp) throws Throwable {
		String methodName = pjp.getSignature().getName();
		Object[] args = pjp.getArgs();
int ret=0;
		System.out.print("user accesing method : " + methodName + "(");
		for (int i = 0; i < args.length; i++) {
			if (i == 0) {
				System.out.print(args[0]);
				continue;
			}
			System.out.print(","+args[i]+")");

			 ret = (int) pjp.proceed();

			System.out.println("method : " + methodName + " ret : " + ret);

		
		}
		return ret;
		}
}
