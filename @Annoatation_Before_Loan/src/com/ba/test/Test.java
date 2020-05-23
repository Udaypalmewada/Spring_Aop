package com.ba.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ba.beans.LoanManager;
import com.ba.config.AspectjConfig;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AspectjConfig.class);
		// ApplicationContext context=new
		// AnnotationConfigApplicationContext("com.ba.aspect","com.ba.beans");
		LoanManager lm = context.getBean("loanManager", LoanManager.class);
		lm.loanAproove(10);
	}

}
