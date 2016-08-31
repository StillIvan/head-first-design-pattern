package com.github.stillivan.pattern.decorator.beverage;

/**
 * 脱因咖啡.
 * Created by charming on 16/8/31.
 */
public class Decaf extends Beverage {
    @Override
    public double cost() {
        return 0.8;
    }
}
