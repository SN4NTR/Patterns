package com.company.patterns.decorator.drink;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class HouseBlend extends Beverage {

    private static double cost = 0.89;

    public HouseBlend() {
        setDescription("House Blend Coffee");
    }

    @Override
    public double getCost() {
        return cost;
    }
}
