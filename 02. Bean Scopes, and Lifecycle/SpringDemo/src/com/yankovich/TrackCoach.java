package com.yankovich;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;

	public TrackCoach() {
		
	}
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k" + " - TrackCoach: getDailyWorkout() method";
	}

	@Override
	public String getDailyFortune() {
		System.out.println("TrackCoach: getDailyFortune() method");
		return "Just Do It: " + fortuneService.getFortune();
	}

	// add an init method
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: inside doMyStartupStuff() method");
	}

	// add d destroy method
	public void doMyCleanupStuff() {
		System.out.println("TrackCoach: inside doMyCleanupStuff() method");
	}

}










