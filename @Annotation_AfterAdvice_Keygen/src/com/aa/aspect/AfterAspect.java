package com.aa.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AfterAspect{
	
@AfterReturning("execution(* com.aa.beans.*.*(..))")	
public void afterreturning(JoinPoint jp) throws Exception {
	
	String mathodname=jp.getSignature().getName();
	Object[] a =jp.getArgs();
     int b=(Integer)a[0];
	if(b<=8){
	
		throw new IllegalArgumentException("PLZ try greather than 8");
	}
	
   }
}
