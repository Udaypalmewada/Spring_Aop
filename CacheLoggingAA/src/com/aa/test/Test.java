package com.aa.test;

import org.springframework.aop.framework.ProxyFactory;

import com.aa.beans.CacheAdvice;
import com.aa.beans.Calculator;
import com.aa.beans.LoggingAdvice;

public class Test {

	public static void main(String[] args) {
		
		ProxyFactory pf = new ProxyFactory();
		
		pf.setTarget(new Calculator());
		pf.addAdvice(new CacheAdvice());
		pf.addAdvice(new LoggingAdvice());
		
		Calculator proxy = (Calculator) pf.getProxy();
	int sum=proxy.add(10, 20);
	System.out.println(sum);
	int sum1=proxy.add(10, 20);
	System.out.println(sum1);
	int sum2=proxy.add(10, 20);
	
	System.out.println(sum2);
	
	}

}
