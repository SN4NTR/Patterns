package com.company.patterns.strategy.animal;

import com.company.patterns.strategy.action.fly.FlyWithWings;
import com.company.patterns.strategy.action.quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a mallard duck");
    }
}
