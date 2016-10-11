package com.github.oycharming.pattern.decorator.beverage;

/**
 * 浓缩咖啡
 * Created by charming on 16/8/31.
 */
public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
