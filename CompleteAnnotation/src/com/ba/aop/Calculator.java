package com.ba.aop;

import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@EnableAspectJAutoProxy
public class Calculator {
	
public int add(int a,int b) {
	return a+b;
}
}
