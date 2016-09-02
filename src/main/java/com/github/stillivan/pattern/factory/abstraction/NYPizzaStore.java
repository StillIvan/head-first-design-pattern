package com.github.stillivan.pattern.factory.abstraction;

import com.github.stillivan.pattern.factory.abstraction.factory.NYPizzaIngredientFactory;
import com.github.stillivan.pattern.factory.abstraction.factory.PizzaIngredientFactory;

/**
 * @author charming
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if (type.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza.");
        } else if (type.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Style Clam Pizza.");
        }

        return pizza;
    }
}
