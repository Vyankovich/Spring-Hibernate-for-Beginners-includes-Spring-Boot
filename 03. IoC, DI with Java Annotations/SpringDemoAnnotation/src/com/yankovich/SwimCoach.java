package com.yankovich;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach {

    @Value("${foo.email}")
    private String email;
    @Value("${foo.team}")
    private String team;

    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

    public SwimCoach() {
        System.out.println("SwimCoach: inside default constructor");
    }

    public String getEmail() {
        return "SwimCoach: inside getEmail()";
    }

    public void setEmail(String email) {
        System.out.println("SwimCoach: inside setEmail");
        this.email = email;
    }

    public String getTeam() {
        return "SwimCoach: inside getTeam()";
    }

    public void setTeam(String team) {
        System.out.println("SwimCoach: inside setTeam");
        this.team = team;
    }

    public FortuneService getFortuneService() {
        System.out.println("SwimCoach: inside getFortuneService()");
        return fortuneService;
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("SwimCoach: inside setFortuneService");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "SwimCoach: inside getDailyWorkout()";
    }

    @Override
    public String getDailyFortune() {
        System.out.println("SwimCoach: inside getDailyFortune()");
        return  fortuneService.getFortune();
    }
}
