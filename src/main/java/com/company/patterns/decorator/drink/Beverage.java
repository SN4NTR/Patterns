package com.company.patterns.decorator.drink;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public abstract class Beverage {

    private String description;

    public abstract double getCost();
}
