package com.app.test;

import org.springframework.aop.framework.ProxyFactory;

import com.app.beans.NotificationAdvice;
import com.app.beans.PhonPe;

public class Test {
	public static void main(String[] args) {

		ProxyFactory pf = new ProxyFactory();
		pf.setTarget(new PhonPe());
		pf.addAdvice(new NotificationAdvice());

		PhonPe proxt=(PhonPe) pf.getProxy();
		proxt.pay("123", "233", "java fees", 1002.4);
		
	}
}
