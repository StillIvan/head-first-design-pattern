package com.github.oycharming.pattern.template.simple;

/**
 * @author Charming
 * @since 2016-09-08 23:54
 */
public abstract class CaffeineBeverage {
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    /**
     * 加调料.
     */
    abstract void addCondiments();

    abstract void brew();

    /**
     * 把谁烧开.
     */
    private void boilWater() {
        System.out.println("Boiling water.");
    }

    /**
     * 把水倒进水杯.
     */
    private void pourInCup() {
        System.out.println("Pouring into cup.");
    }
}
