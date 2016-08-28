package com.github.stillivan.pattern.strategy;

import com.github.stillivan.pattern.strategy.duck.Duck;
import com.github.stillivan.pattern.strategy.duck.MallardDuck;
import com.github.stillivan.pattern.strategy.duck.ModelDuck;
import com.github.stillivan.pattern.strategy.fly.FlyRocketPowered;

/**
 * Created by charming on 16/8/28.
 */
public class Test {
    public static void testMallardDuck() {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
    }

    public static void testModelDuck() {
        Duck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.performQuack();

        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();
    }

    public static void main(String[] args) {
        //testMallardDuck();
        testModelDuck();
    }
}
