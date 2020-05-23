package com.aa.aspect;

import org.aspectj.lang.JoinPoint;

public class Aspect{
	
public void afterreturning(JoinPoint jp) throws Exception {
	
	String mathodname=jp.getSignature().getName();
	Object[] a =jp.getArgs();
     int b=(Integer)a[0];
	if(b<=8){
	
		throw new IllegalArgumentException("PLZ try greather than 8");
	}
	
   }
}
