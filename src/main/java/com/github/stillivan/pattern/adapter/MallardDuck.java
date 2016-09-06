package com.github.stillivan.pattern.adapter;

import com.github.stillivan.pattern.adapter.core.Duck;

/**
 * @author Charming
 * @since 2016-09-06 21:14
 */
public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("quack.");
    }

    @Override
    public void fly() {
        System.out.println("I am flying.");
    }
}
