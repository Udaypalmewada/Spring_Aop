package com.ba.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ba.beans.LoanMgr;
import com.ba.helper.SecurityHelper;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/ba/common/application-context.xml");
		SecurityHelper se=context.getBean("valid", SecurityHelper.class);
		LoanMgr mgr = context.getBean("loanmgr", LoanMgr.class);
		
		se.login("uday", "uday1");
		boolean velid=se.verified();
		System.out.println("User Velidation : "+velid);
	boolean ret=	mgr.loanaproved(12);
	       System.out.println("loanStatus : "+ret);
	}

}
