package com.ba.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AuditAspect {
	
	@Before("target(com.ba.beans.LoanManager)")
	public void before(JoinPoint jp) {
		String name = jp.getSignature().getName();
		Object[] args = jp.getArgs();
		System.out.println("user id accessing method: " + name + "laon account : " + args[0]);
	}
}
