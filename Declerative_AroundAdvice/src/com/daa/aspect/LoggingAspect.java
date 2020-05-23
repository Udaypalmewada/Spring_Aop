package com.daa.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

public class LoggingAspect {
	
	public Object log(ProceedingJoinPoint pjp) throws Throwable {
		String name=pjp.getSignature().getName();
		Object[] args=pjp.getArgs();
		Object ret=0;
		
		System.out.print("entring methid : "+name+"\t");
		System.out.print("args:"+"(");
		for(int i=0;i<args.length;i++) {
			if(i==0) {
				System.out.print(args[i]);
				continue;
			}
			System.out.print(","+args[i]);
			System.out.println(")");
			
		}
		
		ret=(int) pjp.proceed();
		
		System.out.print("exit from method : "+name+" \t args : "+"(");
		for(int i=0;i<args.length;i++) {
			if(i==0) {
				System.out.print(args[i]);
				continue;
			}
			System.out.print(","+args[i]);
			System.out.println(")");
			
		}
		return ret;
		}
}
