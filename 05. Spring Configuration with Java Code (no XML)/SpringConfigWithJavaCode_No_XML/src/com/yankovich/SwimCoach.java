package com.yankovich;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach{

    private FortuneService fortuneService;

    @Value("${foo.email}")
    private String email;

    @Value("${foo.team}")
    private String team;

    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }

    public SwimCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "SwimCoach: inside getDailyWorkout()";
    }

    @Override
    public String getDailyFortune() {
        System.out.println("SwimCoach: inside getDailyFortune()");
        return fortuneService.getFortune();
    }

}
