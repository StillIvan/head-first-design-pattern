package com.github.stillivan.pattern.strategy.quack;

/**
 * 发出吱吱叫的声音
 * Created by charming on 16/8/28.
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak.");
    }
}
