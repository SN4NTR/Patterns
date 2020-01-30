package com.company.patterns.factory.constant;

import lombok.NoArgsConstructor;

import static lombok.AccessLevel.PRIVATE;

@NoArgsConstructor(access = PRIVATE)
public class PizzaType {

    public static final String CHEESE = "cheese";
    public static final String PEPPERONI = "pepperoni";
}
