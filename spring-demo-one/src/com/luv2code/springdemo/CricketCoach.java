package com.luv2code.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	private String emailAddress;
	private String team;
	
	public CricketCoach() {
		// TODO Auto-generated constructor stub
		System.out.println("CricketCoach:  inside no-arg constructor");
	}
	
	
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Dentro de fortune service em CricketCoach");
		this.fortuneService = fortuneService;
	}



	public String getEmailAddress() {
		return emailAddress;
	}



	public void setEmailAddress(String emailAddress) {
		System.out.println("Dentro de setEmail em CricketCoach");
		this.emailAddress = emailAddress;
	}



	public String getTeam() {
		return team;
	}



	public void setTeam(String team) {
		System.out.println("Dentro de setTeam em CricketCoach");
		this.team = team;
	}



	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "practice fast bowling for 15 minutes";
	}

	@Override
	public String getRepsNumber() {
		// TODO Auto-generated method stub
		return "hey ho";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
