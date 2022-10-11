package org.itsci.it311.app.bean;

import org.springframework.stereotype.Component;

@Component("theITSCICoach")
public class BaseballCoach implements Coach {
    private FortuneService fortuneService;

    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return fortuneService.getFortune();
    }

    @Override
    public String getDailyFortune() {
        return "Spend 30 minutes on batting practice";
    }
}
