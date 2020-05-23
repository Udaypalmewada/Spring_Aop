package com.app.test;

import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;

import com.app.beans.NotificationAdvice;
import com.app.beans.NotificationAdviceDynamicPointCut;
import com.app.beans.PhonPe;

public class Test {
	public static void main(String[] args) {

		ProxyFactory pf = new ProxyFactory();
		pf.setTarget(new PhonPe());
		//pf.addAdvice(new NotificationAdvice());
pf.addAdvisor( new DefaultPointcutAdvisor(new NotificationAdviceDynamicPointCut(),new NotificationAdvice()));
		PhonPe proxt=(PhonPe) pf.getProxy();
		proxt.pay("123", "233", "java fees", 101.3);
		
	}
}
