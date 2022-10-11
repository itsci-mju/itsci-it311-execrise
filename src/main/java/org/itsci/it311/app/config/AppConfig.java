package org.itsci.it311.app.config;

import org.itsci.it311.app.bean.BaseballCoach;
import org.itsci.it311.app.bean.Coach;
import org.itsci.it311.app.bean.FortuneService;
import org.itsci.it311.app.bean.HappyFortuneService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.itsci.it311.app")
public class AppConfig {

    @Bean
    public FortuneService getFortunesService() {
        return new HappyFortuneService();
    }

    @Bean
    public Coach getCoach(FortuneService fortuneService) {
        return new BaseballCoach(fortuneService);
    }
}
