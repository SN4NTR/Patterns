package com.company.patterns.decorator.drink;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class Espresso extends Beverage {

    private static double cost = 1.99;

    public Espresso() {
        setDescription("Espresso");
    }

    @Override
    public double getCost() {
        return cost;
    }
}
