package com.github.stillivan.pattern.template;

/**
 * @author Charming
 * @since 2016-09-11 23:24
 */
public class Test {
    public static void testCaffeine() {
        Tea tea = new Tea();
        tea.prepareRecipe();
        System.out.println();
        Coffee coffee = new Coffee();
        coffee.prepareRecipe();
    }

    public static void main(String[] args) {
        testCaffeine();
    }
}
