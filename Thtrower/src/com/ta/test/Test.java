package com.ta.test;

import org.springframework.aop.framework.ProxyFactory;

import com.ta.beans.ThrowAdvice;
import com.ta.beans.Thrower;

public class Test {

	public static void main(String[] args) {
		ProxyFactory pf = new ProxyFactory();
		pf.setTarget(new Thrower());
		pf.addAdvice(new ThrowAdvice());
		Thrower proxt = (Thrower) pf.getProxy();
		int i=proxt.willthrow(11, -10);
		System.out.println(i);
	}

}
