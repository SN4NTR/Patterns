package com.company.patterns.factory;

import com.company.patterns.factory.pizza.Pizza;
import com.company.patterns.factory.store.ChicagoPizzaStore;
import com.company.patterns.factory.store.NYPizzaStore;
import com.company.patterns.factory.store.PizzaStore;

import static com.company.patterns.factory.constant.PizzaType.CHEESE;

public class Main {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza(CHEESE);
    }
}
