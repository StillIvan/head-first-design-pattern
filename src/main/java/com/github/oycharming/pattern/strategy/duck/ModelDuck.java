package com.github.oycharming.pattern.strategy.duck;

import com.github.oycharming.pattern.strategy.fly.FlyNoWay;
import com.github.oycharming.pattern.strategy.quack.Quack;

/**
 * 模型鸭.
 * Created by charming on 16/8/28.
 */
public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I am a model duck.");
    }
}
