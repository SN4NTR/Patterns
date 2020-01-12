package com.company.patterns.strategy;

import com.company.patterns.strategy.action.fly.FlyWithWings;
import com.company.patterns.strategy.animal.Duck;
import com.company.patterns.strategy.animal.MallardDuck;
import com.company.patterns.strategy.animal.ModelDuck;

public class Main {

    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.performQuack();
        mallardDuck.performFly();

        Duck modelDuck = new ModelDuck();
        modelDuck.display();
        modelDuck.performQuack();
        modelDuck.performFly();

        modelDuck.setFlyBehavior(new FlyWithWings());
        modelDuck.performFly();
    }
}
