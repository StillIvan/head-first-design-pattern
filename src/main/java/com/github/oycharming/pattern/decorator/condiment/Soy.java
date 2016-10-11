package com.github.oycharming.pattern.decorator.condiment;

import com.github.oycharming.pattern.decorator.beverage.Beverage;

/**
 * 加豆油.
 * Created by charming on 16/8/31.
 */
public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return 0.2 + beverage.cost();
    }
}
