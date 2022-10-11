package org.itsci.it311.app.bean;

public class HappyFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "Today is your lucky day!";
    }

    @Override
    public void doSomethingInit() {
        System.out.println("Inside doSomethingInit method...");
    }

    @Override
    public void doSomethingDestroy() {
        System.out.println("Inside doSomethingDestroy method...");
    }
}
