package com.ba.beans;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class AuditAdvice implements MethodBeforeAdvice{

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		 System.out.print("user  accesing method:"+method.getName()+"paramete:");
	      for(int i=0;i<args.length;i++) {
	    	  if(i==0) {
	    		  System.out.println(args[0]);
	    		  continue;
	    	  }
	    	  System.out.println(args[i]);
	      }
	      }

}
