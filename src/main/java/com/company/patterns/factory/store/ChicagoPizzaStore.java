package com.company.patterns.factory.store;

import com.company.patterns.factory.pizza.ChicagoStyleCheesePizza;
import com.company.patterns.factory.pizza.ChicagoStylePepperoniPizza;
import com.company.patterns.factory.pizza.Pizza;

import static com.company.patterns.factory.constant.PizzaType.CHEESE;
import static com.company.patterns.factory.constant.PizzaType.PEPPERONI;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        switch (type) {
            case  CHEESE:
                return new ChicagoStyleCheesePizza();
            case PEPPERONI:
                return new ChicagoStylePepperoniPizza();
            default:
                return null;
        }
    }
}
