package com.github.stillivan.pattern.strategy.quack;

/**
 * Created by charming on 16/8/28.
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack.");
    }
}
