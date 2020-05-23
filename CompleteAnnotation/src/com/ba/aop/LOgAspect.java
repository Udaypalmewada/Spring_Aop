package com.ba.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class LOgAspect {
	@Before("within((com.ba.aop.Calculator))")
	public Object log(JoinPoint jp) throws Throwable {
		Object[] args = jp.getArgs();
		String methodName = jp.getSignature().getName();
		int ret = 0;

		System.out.println("user accessing method"+methodName);
		
	//	ret=(int) jp.proceed();
		
		return ret;
	}
}
