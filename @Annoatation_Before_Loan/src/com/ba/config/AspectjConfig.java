package com.ba.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.ba.beans.LoanManager;

@Configuration
@ComponentScan(basePackages = {"com.ba.aspect","com.ba.beans"})

public class AspectjConfig {
	/*@Bean
	public LoanManager LoanManager() {
		return new LoanManager();
	}*/
}
