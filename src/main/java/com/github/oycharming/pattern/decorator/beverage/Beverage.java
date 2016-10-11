package com.github.oycharming.pattern.decorator.beverage;

/**
 * 饮料类.
 * Created by charming on 16/8/31.
 */
public abstract class Beverage {
    protected String description = "Unknown beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
