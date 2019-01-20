package com.keshav.springdemo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("thatSillyCoach")
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("yoyo")
	FortuneService fortuneService;
	
	//Default Constructor
	public TennisCoach()
	{}
	
	
	
	@Override
	public String getDailyWorkout() {
		
		return "Practice your backhand";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

	
	
	

}
