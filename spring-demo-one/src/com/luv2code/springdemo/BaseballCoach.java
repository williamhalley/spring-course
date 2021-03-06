package com.luv2code.springdemo;

public class BaseballCoach implements Coach{
	
	//private field for the dependency
	private FortuneService fortuneService;
	
	//define a constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneService) {
		// TODO Auto-generated constructor stub
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spending 30 minutes on batting practice";
	}

	@Override
	public String getRepsNumber() {
		// TODO Auto-generated method stub
		return "make 100 reps";
	}

	@Override
	public String getDailyFortune() {
		//use my fortune service
		return fortuneService.getFortune();
	}

}
