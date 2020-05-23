package com.ba.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ba.helper.SecurityHelper;
@Component
@Aspect
public class SequrityAspect {
	@Autowired
	private SecurityHelper helper;

	public void setHelper(SecurityHelper helper) {
		this.helper = helper;
	}
@Pointcut("execution( * com.ba.beans.*.*(..))")
public void point() {}
	
@Before("point()")
	public void audit(JoinPoint jp) {
		String name = jp.getSignature().getName();
		Object[] args = jp.getArgs();
		System.out.println("user is accesing method :"+name);
	}
@Before("point()")
	public void sequrity(JoinPoint jp) {
		String name = jp.getSignature().getName();
		Object[] args = jp.getArgs();

		System.out.println("inside sequrityAspect");
	}
}
