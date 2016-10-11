package com.github.oycharming.pattern.strategy.fly;

/**
 * 不能飞.
 * Created by charming on 16/8/28.
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly.");
    }
}
