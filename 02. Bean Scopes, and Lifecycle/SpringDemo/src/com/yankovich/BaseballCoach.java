package com.yankovich;

public class BaseballCoach implements Coach {

	// define a private field for the dependency
	private FortuneService fortuneService;
	
	// define a constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice" + " - BaseballCoach: getDailyWorkout() method";
	}

	@Override
	public String getDailyFortune() {		
		// use my fortuneService to get a fortune
		System.out.println("BaseballCoach: getDailyFortune() method");
		return fortuneService.getFortune();
	}
}








