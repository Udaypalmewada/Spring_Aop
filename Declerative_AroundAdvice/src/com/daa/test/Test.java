package com.daa.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.daa.beans.Calculator;

public class Test {

	public static void main(String[] args) {
ApplicationContext context =new ClassPathXmlApplicationContext("com/daa/common/application-context.xml");
Calculator cal=context.getBean("calculator",Calculator.class);
int ret=cal.add(10, 20);
System.out.println(ret);
	}

}
