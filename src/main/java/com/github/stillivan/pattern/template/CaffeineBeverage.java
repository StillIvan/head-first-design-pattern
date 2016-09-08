package com.github.stillivan.pattern.template;

/**
 * @author Charming
 * @since 2016-09-08 23:54
 */
public abstract class CaffeineBeverage {
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    abstract void addCondiments();

    private void pourInCup() {
        System.out.println("Pouring into cup.");
    }

    abstract void brew();

    private void boilWater() {
        System.out.println("Boiling water.");
    }
}
