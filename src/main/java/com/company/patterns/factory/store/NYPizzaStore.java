package com.company.patterns.factory.store;

import com.company.patterns.factory.pizza.NYStyleCheesePizza;
import com.company.patterns.factory.pizza.NYStylePepperoniPizza;
import com.company.patterns.factory.pizza.Pizza;

import static com.company.patterns.factory.constant.PizzaType.CHEESE;
import static com.company.patterns.factory.constant.PizzaType.PEPPERONI;

public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        switch (type.toLowerCase()) {
            case CHEESE:
                return new NYStyleCheesePizza();
            case PEPPERONI:
                return new NYStylePepperoniPizza();
            default:
                return null;
        }
    }
}
