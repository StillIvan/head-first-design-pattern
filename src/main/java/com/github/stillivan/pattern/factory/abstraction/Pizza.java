package com.github.stillivan.pattern.factory.abstraction;

import com.github.stillivan.pattern.factory.abstraction.ingredient.Cheese;
import com.github.stillivan.pattern.factory.abstraction.ingredient.Clams;
import com.github.stillivan.pattern.factory.abstraction.ingredient.Dough;
import com.github.stillivan.pattern.factory.abstraction.ingredient.Pepperoni;
import com.github.stillivan.pattern.factory.abstraction.ingredient.Sauce;
import com.github.stillivan.pattern.factory.abstraction.ingredient.Veggies;

/**
 * Pizza 接口
 * @author charming
 */
public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clam;

    abstract void prepare();

    void bake() {
        System.out.println("Bake for 25 minutes at 350.");
    }

    void cut() {
        System.out.println("Cutting the pizza into diagonal slices.");
    }

    void box() {
        System.out.println("Place pizza in official PizzaStore box.");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return name;
    }
}
