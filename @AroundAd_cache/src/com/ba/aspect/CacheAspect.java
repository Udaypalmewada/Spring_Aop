package com.ba.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;

import com.ba.helper.Cache;

@Aspect
public class CacheAspect {
	private Cache cache;;

	public void setCache(Cache cache) {
		this.cache = cache;
	}

	@Pointcut("within(com.ba.beans.*)")
	public void Sequrity() {
	}
	@Around("Sequrity()")
	public Object log(ProceedingJoinPoint pjp) throws Throwable {

		String methodname = pjp.getSignature().getName();
		Object[] args = pjp.getArgs();
		Object ret = null;

		String key = null;

		key = methodname;
		key += "(";
		for (int i = 0; i < args.length; i++) {
			if (i == 0) {
				key += args[i];
				continue;
			}
			key += "," + args[i];
		}
		key += ")";
		System.out.println("log: "+key);
		ret = pjp.proceed();

		System.out.println("log: " + methodname + " ret :" + ret);
		return ret;
	}

	@Around("Sequrity()")
	@Order(1)
	public Object cacheAspect(ProceedingJoinPoint pjp) throws Throwable {

		String methodname = pjp.getSignature().getName();
		Object[] args = pjp.getArgs();
		Object ret = null;

		String key = null;

		key = methodname;
		key += "(";
		for (int i = 0; i < args.length; i++) {
			if (i == 0) {
				key += args[i];
				continue;
			}
			key += "," + args[i];
		}
		key += ")";

		if (cache.contain(key)) {
			System.out.println("return from cache");
			ret = cache.get(key);
		}

		else {
			ret = pjp.proceed();
			cache.put(key, ret);
			System.out.println("added in map");
		}

		return ret;
	}


}
