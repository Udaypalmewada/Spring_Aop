package com.ba.beans;

import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@EnableAspectJAutoProxy
public class LoanManager {
	public boolean loanAproove(long number) {
		System.out.println("loanAprooved ");

		return true;
	}
}
