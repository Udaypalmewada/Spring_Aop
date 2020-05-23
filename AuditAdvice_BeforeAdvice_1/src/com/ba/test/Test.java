package com.ba.test;

import org.springframework.aop.framework.ProxyFactory;

import com.ba.beans.AuditAdvice;
import com.ba.beans.LoanApprualManager;

public class Test {

	public static void main(String[] args) {
      ProxyFactory pf=new ProxyFactory();
      pf.setTarget(new LoanApprualManager());
      pf.addAdvice(new AuditAdvice());
      
      LoanApprualManager mgr=(LoanApprualManager) pf.getProxy();
      mgr.loanapprove(111);
	}

}
