package com.keshav.springdemo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("thatSillyCoach")
public class TennisCoach implements Coach {
	
	FortuneService fortuneService;
	
	//Default Constructor
	public TennisCoach()
	{}
	
	//Define a setter method
	@Autowired
	public void setFortuneService(FortuneService theFortuneService)
	{
		fortuneService = theFortuneService;
	}
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
