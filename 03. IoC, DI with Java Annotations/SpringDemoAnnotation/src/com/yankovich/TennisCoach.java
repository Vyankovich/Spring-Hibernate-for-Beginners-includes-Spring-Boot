package com.yankovich;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy // 1.4.4. Lazy-initialized Beans
public class TennisCoach implements Coach {

    @Autowired
    @Qualifier(value = "randomFortuneService")
    private FortuneService fortuneService;

    // define default constructor
    public TennisCoach() {
        System.out.println("TennisCoach: inside default constructor");
    }


/* ---- using @Qualifier with a constructor
   @Autowired
    public TennisCoach(@Qualifier("randomFortuneService") FortuneService theFortuneService) {

        System.out.println(">> TennisCoach: inside constructor using @autowired and @qualifier");

        fortuneService = theFortuneService;
    } ------------------    */

    // define a setter method
/*    @Autowired
    public void setFortuneService(FortuneService theFortuneService) {
        System.out.println("TennisCoach: inside setFortuneService()");
        this.fortuneService = theFortuneService;
    }*/

    @Override
    public String getDailyWorkout() {
        return "TennisCoach: inside getDailyWorkout()";
    }

    @Override
    public String getDailyFortune() {
        System.out.println("TennisCoach: inside getDailyFortune()");
        return fortuneService.getFortune();
    }

}