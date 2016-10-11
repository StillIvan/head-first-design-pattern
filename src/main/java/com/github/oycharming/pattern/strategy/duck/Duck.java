package com.github.oycharming.pattern.strategy.duck;

import com.github.oycharming.pattern.strategy.fly.FlyBehavior;
import com.github.oycharming.pattern.strategy.quack.QuackBehavior;

/**
 * 鸭子抽象类.
 * Created by charming on 16/8/28.
 */
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {
    }

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
