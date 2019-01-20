package com.keshav.springdemo;

public class SwimCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public SwimCoach(FortuneService theFortuneService)
	{
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Swim 100m";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
