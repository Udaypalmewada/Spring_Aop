package com.aa.beans;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@EnableAspectJAutoProxy
@ComponentScan(basePackages = {"com.aa.aspect","com.aa.beans"})
public class KeyGenerator {
public int genrator(int number) {
	System.out.println("KeyGenerator(-)");
	
	return 1;
}
}
