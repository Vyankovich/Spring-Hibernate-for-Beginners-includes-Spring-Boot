package com.yankovich;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by vyankovich on 2019-07-08
 */
public class BeanLifeCircleDemoApp {

    public static void main(String[] args) {

        // load the spring configuration file

        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCircle-applicationContext.xml")) {

            // retrieve bean from spring container
            Coach theCoach = context.getBean("myCoach", Coach.class);

            // call methods on the bean
            System.out.println(theCoach.getDailyWorkout());

        }
    }

}
