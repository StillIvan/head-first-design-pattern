package com.github.oycharming.pattern.decorator.condiment;

import com.github.oycharming.pattern.decorator.beverage.Beverage;

/**
 * 调料装饰者.
 * Created by charming on 16/8/31.
 */
public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
