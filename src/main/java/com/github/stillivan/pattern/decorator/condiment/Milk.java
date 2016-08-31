package com.github.stillivan.pattern.decorator.condiment;

import com.github.stillivan.pattern.decorator.beverage.Beverage;

/**
 * 加牛奶调料.
 * Created by charming on 16/8/31.
 */
public class Milk extends CondimentDecorator {
    Beverage beverage;

    @Override
    public String getDescription() {
        return "milk";
    }

    @Override
    public double cost() {
        return 0.2 + beverage.cost();
    }
}
