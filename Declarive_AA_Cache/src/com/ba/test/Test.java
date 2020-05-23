package com.ba.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ba.beans.Calculator;

public class Test {

	public static void main(String[] args) {
    
		ApplicationContext context=new ClassPathXmlApplicationContext("com/ba/common/application-context.xml");
	Calculator cal=context.getBean("calculator", Calculator.class);
	int sum=(Integer) cal.add(10, 20);

	System.out.println(sum);
	int sum1=(Integer) cal.add(10, 20);
	System.out.println(sum1);
	
	int sum2=(Integer) cal.add(10, 20);
	System.out.println(sum2);
	
	
	}

}
