package com.keshav.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	//Create an array of strings
	private String data[] = {
			"Beware",
			"Diligence",
			"Reward"
	};
	
	//Create a random number generator
	private Random myRandom = new Random();
	
	@Override
	public String getFortune() {
		
		//Pick a random number from the array
		int index = myRandom.nextInt(data.length);
		
		String theFortune = data[index];
		
		return theFortune;
	}

}
