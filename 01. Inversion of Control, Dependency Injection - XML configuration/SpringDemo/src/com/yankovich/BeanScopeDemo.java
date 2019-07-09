package com.yankovich;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by vyankovich on 2019-07-08
 */
public class BeanScopeDemo {

    public static void main(String[] args) {

        // load the spring configuration file
        Coach theCoach;
        Coach alphaCoach;
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml")) {

            // retrieve bean from spring container
            theCoach = context.getBean("myCoach", Coach.class);
            alphaCoach = context.getBean("myCoach", Coach.class);

            // check if they are the same beans
            boolean result = (theCoach == alphaCoach);
            // print results
            System.out.println("Pointing to the same object: " + result);
            System.out.println("Memory location for theCoach: " + theCoach);
            System.out.println("Memory location for alphaCoach: " + alphaCoach);

        }
    }

}
