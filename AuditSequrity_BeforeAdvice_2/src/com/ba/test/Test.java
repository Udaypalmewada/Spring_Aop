package com.ba.test;

import org.springframework.aop.framework.ProxyFactory;

import com.ba.beans.AuditAdvice;
import com.ba.beans.LoanApprualManager;
import com.ba.beans.SequritAdvice;
import com.ba.helper.Authentication;

public class Test {

	public static void main(String[] args) {
		
      ProxyFactory pf=new ProxyFactory();
      pf.setTarget(new LoanApprualManager());
      pf.addAdvice(new SequritAdvice());
      pf.addAdvice(new AuditAdvice());
    
      LoanApprualManager mgr=(LoanApprualManager) pf.getProxy();
      Authentication authentication=Authentication.getinsatnce();
      authentication.authentcate();
      
      authentication.login("uday", "uday1");
      
     
      System.out.println( mgr.loanapprove(111));
     
	}

}
