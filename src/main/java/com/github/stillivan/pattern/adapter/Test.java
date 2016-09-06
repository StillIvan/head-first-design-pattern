package com.github.stillivan.pattern.adapter;

import com.github.stillivan.pattern.adapter.core.Duck;
import com.github.stillivan.pattern.adapter.core.TurkeyAdapter;

/**
 * @author Charming
 * @since 2016-09-06 21:18
 */
public class Test {
    static void testDuck(Duck duck) {
        duck.fly();
        duck.quack();
    }

    static void turkeyAdapterTest() {
        MallardDuck duck = new MallardDuck();

        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nThe Duck says...");
        testDuck(duck);

        System.out.println("\nThe TurkeyAdapter says...");
        testDuck(turkeyAdapter);
    }

    public static void main(String[] args) {
        turkeyAdapterTest();
    }
}
