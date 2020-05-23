package com.ba.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

import com.ba.helper.Cache;

public class CacheAspect {
private Cache cache=null;

	public Object before(ProceedingJoinPoint pjp) throws Throwable {

		String methodname = pjp.getSignature().getName();
		Object[] args = pjp.getArgs();
		Object ret=null;
		
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
		
		System.out.println("generated key : " + key);
		   cache=Cache.getInstance();
		   
			if (cache.contain(key)) {
	                System.out.println("return from cache");
	              ret=cache.get(key);
			}
			
			else{
				ret = pjp.proceed();
				cache.put(key,ret);
				System.out.println("added in map");
			}
	
			return ret;
		}
		
	
	}

