package com.company.patterns.strategy.animal;

import com.company.patterns.strategy.action.fly.FlyNoWay;
import com.company.patterns.strategy.action.quack.QuackMute;

public class ModelDuck extends Duck {

    public ModelDuck() {
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new QuackMute();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
