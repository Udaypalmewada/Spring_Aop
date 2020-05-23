package com.ba.aspect;

import org.aspectj.lang.JoinPoint;

public class AuditAspect {

	public void before(JoinPoint jp) {

		String name = jp.getSignature().getName();
		Object[] args = jp.getArgs();
		
		System.out.println("user id accessing method: " + name + "laon account : " + args[0]);
	}
}
