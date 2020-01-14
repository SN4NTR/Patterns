package com.company.patterns.decorator.wrapper.condiment;

import com.company.patterns.decorator.drink.Beverage;
import com.company.patterns.decorator.wrapper.CondimentDecorator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Mocha extends CondimentDecorator {

    private Beverage beverage;

    private static double cost = 0.20;
    private static String description = "Mocha";

    @Override
    public String getDescription() {
        String beverageDescription = beverage.getDescription();
        return beverageDescription + ", " + description;
    }

    @Override
    public double getCost() {
        double beverageCost = beverage.getCost();
        return cost + beverageCost;
    }
}
