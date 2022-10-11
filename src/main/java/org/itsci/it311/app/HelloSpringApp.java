package org.itsci.it311.app;

import org.itsci.it311.app.bean.Coach;
import org.itsci.it311.app.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloSpringApp {
    public static void main(String[] args) {
        // load the spring configuration file
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        // retrieve bean from spring contrainer
        Coach bean = (Coach) context.getBean("theITSCICoach");
        // call method on bean
        System.out.println(bean.getDailyWorkout());
        // call our new method for fortune
        System.out.println(bean.getDailyFortune());
    }
}
