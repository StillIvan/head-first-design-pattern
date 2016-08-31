package com.github.stillivan.pattern.decorator.condiment;

import com.github.stillivan.pattern.decorator.beverage.Beverage;

/**
 * 加奶油.
 * Created by charming on 16/8/31.
 */
public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return 0.3 + beverage.cost();
    }
}
