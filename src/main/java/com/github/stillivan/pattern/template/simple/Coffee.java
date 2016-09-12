package com.github.stillivan.pattern.template.simple;

/**
 * @author Charming
 * @since 2016-09-11 23:22
 */
public class Coffee extends CaffeineBeverage {
    /**
     * 加调料.
     */
    @Override
    void addCondiments() {
        System.out.println("Adding sugar and milk.");
    }

    @Override
    void brew() {
        System.out.println("Dripping coffee through filter.");
    }
}
