package com.github.stillivan.pattern.strategy.duck;

import com.github.stillivan.pattern.strategy.fly.FlyWithWings;
import com.github.stillivan.pattern.strategy.quack.Quack;

/**
 * 野鸭
 * Created by charming on 16/8/28.
 */
public class MallardDuck extends Duck {
    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I am a mini duck simulator");
    }
}
