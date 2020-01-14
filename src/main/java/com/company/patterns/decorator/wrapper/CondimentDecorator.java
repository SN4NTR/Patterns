package com.company.patterns.decorator.wrapper;

import com.company.patterns.decorator.drink.Beverage;

public abstract class CondimentDecorator extends Beverage {

    public abstract String getDescription();
}
