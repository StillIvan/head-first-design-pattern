package com.github.stillivan.pattern.template.simple;

/**
 * @author Charming
 * @since 2016-09-11 23:21
 */
public class Tea extends CaffeineBeverage {
    /**
     * 加调料.
     */
    @Override
    void addCondiments() {
        System.out.println("Pouring into cup.");
    }

    @Override
    void brew() {
        System.out.println("Steeping the tea.");
    }
}
