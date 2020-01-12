package com.company.patterns.strategy.action.quack;

public class QuackMute implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
