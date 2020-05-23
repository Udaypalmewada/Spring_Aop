package com.aa.test;

import org.springframework.aop.Advisor;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.framework.adapter.DefaultAdvisorAdapterRegistry;
import org.springframework.aop.support.DefaultPointcutAdvisor;

import com.aa.beans.Calculator;
import com.aa.beans.LogginCutpoint_static;
import com.aa.beans.LoggingAdvice;

public class Test {

	public static void main(String[] args) {
		ProxyFactory pf = new ProxyFactory();
		pf.setTarget(new Calculator());
	//	pf.addAdvice(new LoggingAdvice());
		pf.addAdvisor(new DefaultPointcutAdvisor(new LogginCutpoint_static(),new LoggingAdvice()));
		Calculator proxy = (Calculator) pf.getProxy();
	int sum=	proxy.add(10, 20);
	System.out.println("sum: "+sum);
	int mul=	proxy.multiply(10, 20);
	System.out.println("mul: "+mul);
	}

}
