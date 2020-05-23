package com.ba.aspect;

import org.aspectj.lang.JoinPoint;
import com.ba.helper.SecurityHelper;
import com.ba.helper.User;

public class Aspect {
	private SecurityHelper helper;

	public void setHelper(SecurityHelper helper) {
		this.helper = helper;
	}

	public void sequrityAspect(JoinPoint jp) {
		String name = jp.getSignature().getName();
		Object[] args = jp.getArgs();

		System.out.println("sequrityAspect");
	}

	public void auditAspect(JoinPoint jp) {
		String name = jp.getSignature().getName();
		Object[] args = jp.getArgs();
		System.out.println("user accesing method :" + name);
	}

}
