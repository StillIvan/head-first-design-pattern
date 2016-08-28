package com.github.stillivan.pattern.strategy.fly;

/**
 * Created by charming on 16/8/28.
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying.");
    }
}
