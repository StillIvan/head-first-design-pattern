package com.github.stillivan.pattern.factory;

import com.github.stillivan.pattern.factory.abstraction.NYPizzaStore;
import com.github.stillivan.pattern.factory.method.ChicagoStylePizzaStore;
import com.github.stillivan.pattern.factory.method.NYStylePizzaStore;
import com.github.stillivan.pattern.factory.method.Pizza;

/**
 * @author charming
 */
public class Test {
    public static void methodTest() {
        ChicagoStylePizzaStore chicagoPizzaStore = new ChicagoStylePizzaStore();
        NYStylePizzaStore nyPizzaStore = new NYStylePizzaStore();

        Pizza pizza = nyPizzaStore.orderPizza("cheese");

        pizza = chicagoPizzaStore.orderPizza("cheese");
    }

    public static void abstractionTest() {
        NYPizzaStore nyPizzaStore = new NYPizzaStore();

        com.github.stillivan.pattern.factory.abstraction.Pizza pizza = nyPizzaStore.orderPizza("clam");
    }

    public static void main(String[] args) {
        //methodTest();
        abstractionTest();
    }
}
