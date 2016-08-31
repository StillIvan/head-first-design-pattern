package com.github.stillivan.pattern.decorator.beverage;

/**
 * 深度烘焙咖啡.
 * Created by charming on 16/8/31.
 */
public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "Dark Roast coffee";
    }

    @Override
    public double cost() {
        return 2.3;
    }
}
