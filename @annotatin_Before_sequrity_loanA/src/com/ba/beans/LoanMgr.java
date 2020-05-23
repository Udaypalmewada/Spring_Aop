package com.ba.beans;

import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@EnableAspectJAutoProxy
public class LoanMgr {

	public boolean loanaproved(long loanNumber) {
		System.out.println("loan aprooved"+loanNumber);
		
		return true;
	}
}
