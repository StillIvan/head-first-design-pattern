package com.github.stillivan.pattern.factory.abstraction.factory;

import com.github.stillivan.pattern.factory.abstraction.ingredient.Cheese;
import com.github.stillivan.pattern.factory.abstraction.ingredient.Clams;
import com.github.stillivan.pattern.factory.abstraction.ingredient.Dough;
import com.github.stillivan.pattern.factory.abstraction.ingredient.Pepperoni;
import com.github.stillivan.pattern.factory.abstraction.ingredient.Sauce;
import com.github.stillivan.pattern.factory.abstraction.ingredient.Veggies;

/**
 * @author charming
 */
public interface PizzaIngredientFactory {
    Dough createDough();

    Sauce createSauce();

    Cheese createCheese();

    Veggies[] createVeggies();

    Pepperoni createPepperoni();

    Clams createClam();
}
