package com.aa.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aa.beans.KeyGenerator;

public class Test {

	public static void main(String[] args) {
	//	ApplicationContext context = new ClassPathXmlApplicationContext("com/aa/common/application-contex.xml");
		ApplicationContext context=new AnnotationConfigApplicationContext("com.aa.beans");
		
		KeyGenerator keygenrator = context.getBean("keyGenerator", KeyGenerator.class);

		int value = keygenrator.genrator(9);
		System.out.println("generatoed Strong key"+value);
	}

}
