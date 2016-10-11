package com.github.oycharming.pattern.template.hook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Charming
 * @since 2016-09-11 23:22
 */
public class CoffeeWithHook extends CaffeineBeverageWithHook {
    /**
     * 加调料.
     */
    @Override
    void addCondiments() {
        System.out.println("Adding sugar and milk.");
    }

    @Override
    void brew() {
        System.out.println("Dripping coffee through filter.");
    }

    @Override
    boolean customerWantsCondiments() {
        String answer = getUserInput();
        return answer.toLowerCase().startsWith("y");
    }

    private String getUserInput() {
        String answer = null;

        System.out.println("Would you like to add sugar and milk into coffee?\n");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return answer == null ? "no" : answer;
    }
}
