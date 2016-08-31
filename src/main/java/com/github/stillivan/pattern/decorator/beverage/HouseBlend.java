package com.github.stillivan.pattern.decorator.beverage;

/**
 * 综合咖啡.
 * Created by charming on 16/8/31.
 */
public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
