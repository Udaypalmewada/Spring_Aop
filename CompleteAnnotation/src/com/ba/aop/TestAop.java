package com.ba.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAop {
	
public static void main(String[] args) {
	ApplicationContext context=new AnnotationConfigApplicationContext("com\\ba\\aop");
	Calculator calculator=context.getBean("calculator", Calculator.class);
int sum=calculator.add(10, 10);
System.out.println(sum);
}
}
