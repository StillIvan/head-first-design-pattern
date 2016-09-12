package com.github.stillivan.pattern.template;

import com.github.stillivan.pattern.template.hook.CoffeeWithHook;
import com.github.stillivan.pattern.template.hook.TeaWithHook;
import com.github.stillivan.pattern.template.simple.Coffee;
import com.github.stillivan.pattern.template.simple.Tea;

/**
 * @author Charming
 * @since 2016-09-11 23:24
 */
public class Test {
    private static void testCaffeine() {
        Tea tea = new Tea();
        tea.prepareRecipe();
        System.out.println();
        Coffee coffee = new Coffee();
        coffee.prepareRecipe();
    }

    private static void testHook() {
        TeaWithHook teaWithHook = new TeaWithHook();
        teaWithHook.prepareRecipe();
        System.out.println();
        CoffeeWithHook coffeeWithHook = new CoffeeWithHook();
        coffeeWithHook.prepareRecipe();
        System.out.println();
    }

    public static void main(String[] args) {
        //testCaffeine();
        testHook();
    }
}
