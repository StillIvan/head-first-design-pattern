package com.github.stillivan.pattern.strategy.quack;

/**
 * 不能发出声音
 * Created by charming on 16/8/28.
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Silence.");
    }
}
