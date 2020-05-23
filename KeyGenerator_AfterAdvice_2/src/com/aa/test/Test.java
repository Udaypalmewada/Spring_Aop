package com.aa.test;

import org.springframework.aop.framework.ProxyFactory;

import com.aa.beans.KeyGenerator;
import com.aa.beans.KeyGeneratorAdvice;

public class Test {

	public static void main(String[] args) {
     ProxyFactory pf=new ProxyFactory();
     pf.setTarget(new KeyGenerator());
     pf.addAdvice(new KeyGeneratorAdvice());
     
     KeyGenerator proxy=(KeyGenerator) pf.getProxy();
     proxy.generatedKey(-12);
	}

}
