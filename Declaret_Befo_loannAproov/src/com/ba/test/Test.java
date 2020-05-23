package com.ba.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ba.beans.LoanManager;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/ba/common/application-context.xml");
		LoanManager lm = context.getBean("loanmgr", LoanManager.class);
		lm.loanAproove(10);
	}

}
