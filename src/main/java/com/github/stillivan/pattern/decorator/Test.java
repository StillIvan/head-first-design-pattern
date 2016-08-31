package com.github.stillivan.pattern.decorator;

import com.github.stillivan.pattern.decorator.beverage.Beverage;
import com.github.stillivan.pattern.decorator.beverage.DarkRoast;
import com.github.stillivan.pattern.decorator.beverage.Espresso;
import com.github.stillivan.pattern.decorator.condiment.Mocha;
import com.github.stillivan.pattern.decorator.condiment.Soy;
import com.github.stillivan.pattern.decorator.condiment.Whip;
import com.github.stillivan.pattern.decorator.lowercase.LowerCaseInputStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by charming on 16/8/31.
 */
public class Test {
    public static final void starbuzzCoffee() {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        Beverage beverage3 = new DarkRoast();
        beverage3 = new Mocha(beverage3);
        beverage3 = new Soy(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
    }

    public static final void lowerCase() {
        int c;
        try {
            InputStream in = new LowerCaseInputStream(new BufferedInputStream(
                    new FileInputStream(Test.class.getResource("").getPath() + "test.txt")
            ));

            while ((c = in.read()) >= 0) {
                System.out.print((char) c);
            }

            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        //starbuzzCoffee();
        lowerCase();
    }
}
