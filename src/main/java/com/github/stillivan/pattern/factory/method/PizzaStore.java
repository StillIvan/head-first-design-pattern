package com.github.stillivan.pattern.factory.method;

/**
 * @author charming
 */
public abstract class PizzaStore {
    public Pizza orderPizza(String type) {
        Pizza pizza;
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    // 允许子类做决定
    abstract Pizza createPizza(String type);
}
