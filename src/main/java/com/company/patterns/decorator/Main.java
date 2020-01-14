package com.company.patterns.decorator;

import com.company.patterns.decorator.drink.Beverage;
import com.company.patterns.decorator.drink.Espresso;
import com.company.patterns.decorator.drink.HouseBlend;
import com.company.patterns.decorator.wrapper.condiment.Mocha;
import com.company.patterns.decorator.wrapper.condiment.Soy;
import com.company.patterns.decorator.wrapper.condiment.Whip;

public class Main {

    public static void main(String[] args) {
        Beverage espresso = new Espresso();

        String beverageDescription = espresso.getDescription();
        double beverageCost = espresso.getCost();

        String info = String.format("Description: %s\n" + "Cost: %s", beverageDescription, beverageCost);
        System.out.println(info);

        Beverage houseBlend = new HouseBlend();
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Soy(houseBlend);
        houseBlend = new Whip(houseBlend);

        beverageDescription = houseBlend.getDescription();
        beverageCost = houseBlend.getCost();
        info = String.format("Description: %s\n" + "Cost: %s", beverageDescription, beverageCost);
        System.out.println(info);
    }
}
