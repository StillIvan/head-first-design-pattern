package com.github.stillivan.pattern.factory.abstraction.factory;

import com.github.stillivan.pattern.factory.abstraction.ingredient.Cheese;
import com.github.stillivan.pattern.factory.abstraction.ingredient.Clams;
import com.github.stillivan.pattern.factory.abstraction.ingredient.Dough;
import com.github.stillivan.pattern.factory.abstraction.ingredient.FreshClams;
import com.github.stillivan.pattern.factory.abstraction.ingredient.Garlic;
import com.github.stillivan.pattern.factory.abstraction.ingredient.MarinaraSauce;
import com.github.stillivan.pattern.factory.abstraction.ingredient.MushRoom;
import com.github.stillivan.pattern.factory.abstraction.ingredient.Onion;
import com.github.stillivan.pattern.factory.abstraction.ingredient.Pepperoni;
import com.github.stillivan.pattern.factory.abstraction.ingredient.RedPepper;
import com.github.stillivan.pattern.factory.abstraction.ingredient.ReggianoCheese;
import com.github.stillivan.pattern.factory.abstraction.ingredient.Sauce;
import com.github.stillivan.pattern.factory.abstraction.ingredient.SlicedPepperoni;
import com.github.stillivan.pattern.factory.abstraction.ingredient.ThinCrustDough;
import com.github.stillivan.pattern.factory.abstraction.ingredient.Veggies;

/**
 * @author charming
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = {new Garlic(), new Onion(), new MushRoom(), new RedPepper()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}
