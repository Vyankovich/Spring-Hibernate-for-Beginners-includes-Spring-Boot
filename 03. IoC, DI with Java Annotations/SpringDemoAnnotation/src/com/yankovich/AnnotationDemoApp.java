package com.yankovich;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

    public static void main(String[] args) {

        // load spring config file
        try (ClassPathXmlApplicationContext context =
                     new ClassPathXmlApplicationContext("applicationContext.xml")) {

            // get the bean from spring container
            SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);
            System.out.println("Memory location for theCoach: " + theCoach);

        // call a method on the bean
        System.out.println(theCoach.getDailyWorkout());

        // call method to get the daily fortune
            System.out.println(theCoach.getDailyFortune());

            // call our new swim coach methods ... has the props values injected
            System.out.println("email: " + theCoach.getEmail());
            System.out.println("team: " + theCoach.getTeam());

        // close context
        }

    }

}
