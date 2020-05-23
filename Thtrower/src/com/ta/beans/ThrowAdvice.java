package com.ta.beans;

import org.springframework.aop.ThrowsAdvice;

public class ThrowAdvice implements ThrowsAdvice{
	
	public void afterThrowing(IllegalArgumentException e) {
		System.out.println("from Illigleexception");
		System.out.println(e.getMessage());
	}
	public void afterThrowing(Exception e) {
	  System.out.println("from exception");
		System.out.println(e.getMessage());
	}
	

}
