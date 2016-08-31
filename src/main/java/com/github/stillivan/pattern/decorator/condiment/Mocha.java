package com.github.stillivan.pattern.decorator.condiment;

import com.github.stillivan.pattern.decorator.beverage.Beverage;

/**
 * 加摩卡.
 * Created by charming on 16/8/31.
 */
public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return 0.10 + beverage.cost();
    }
}
