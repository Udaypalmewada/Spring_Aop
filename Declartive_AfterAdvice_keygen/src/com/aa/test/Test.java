package com.aa.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aa.beans.KeyGenerator;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/aa/common/application-contex.xml");
		KeyGenerator keygenrator = context.getBean("keygenrator", KeyGenerator.class);

		int value = keygenrator.genrator(10);
		System.out.println("generatoed key"+value);
	}

}
