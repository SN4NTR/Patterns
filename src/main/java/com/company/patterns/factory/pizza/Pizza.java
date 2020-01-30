package com.company.patterns.factory.pizza;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public abstract class Pizza {

    private String name;
    private String dough;
    private String sauce;

    private final List<String> toppings = new ArrayList<>();

    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.print("Adding toppings:");
        for (String topping : toppings) {
            System.out.print(" " + topping);
        }
    }

    public void bake() {
        System.out.println("Baking...");
    }

    public void cut() {
        System.out.println("Cutting...");
    }

    public void box() {
        System.out.println("Placing in the box...");
    }
}
