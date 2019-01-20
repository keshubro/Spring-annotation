package com.keshav.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {
	
	//Define bean for sad fortune service
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	
	//Define bean for swim coach and inject dependency
	@Bean
	public Coach swimCoach()
	{
		return new SwimCoach(sadFortuneService());
		
	}

}
