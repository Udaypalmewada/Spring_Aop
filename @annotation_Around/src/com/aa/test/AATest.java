package com.aa.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aa.beans.Calculator;

public class AATest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/aa/common/application-context.xml");
Calculator cal=context.getBean("calculator", Calculator.class);
int sum=cal.add(10, 20);
	
	}

}
