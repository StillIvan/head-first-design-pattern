package com.github.oycharming.pattern.strategy.fly;

/**
 * 用翅膀飞.
 * Created by charming on 16/8/28.
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying.");
    }
}
