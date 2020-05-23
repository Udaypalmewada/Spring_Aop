package com.aa.beans;

import java.util.concurrent.ConcurrentHashMap;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import com.aa.helper.Cache;

public class CacheAdvice implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation methodinvocation) throws Throwable {
		String methhodName;
		Object[] args;
		Object ret = null;
		Cache cache = null;
		String key = null;
		
		methhodName = methodinvocation.getMethod().getName();
		args = methodinvocation.getArguments();
		
     key= methhodName+"(";
		for (int i = 0; i<args.length; i++) {
			if (i == 0) {
				key=key+args[i];
				continue;
			}
			key+=",";
			key=key+args[i];
        key=key+")";
		}
        
        System.out.println(key);
        
        cache=Cache.getInstance();
		if (cache.containKey(key)) {
                System.out.println("return from cache");
              ret=cache.get(key);
		}
		
		else{
			ret = methodinvocation.proceed();
			cache.put(key,ret);
			System.out.println("added in map");
		}
		return ret;
	}
	
	}

	 
