package com.github.oycharming.pattern.template.hook;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Charming
 * @since 2016-09-11 23:21
 */
public class TeaWithHook extends CaffeineBeverageWithHook {
    /**
     * 加调料.
     */
    @Override
    void addCondiments() {
        System.out.println("Pouring into cup.");
    }

    @Override
    void brew() {
        System.out.println("Steeping the tea.");
    }

    @Override
    boolean customerWantsCondiments() {
        String answer = getUserInput();
        return answer.toLowerCase().startsWith("y");
    }

    private String getUserInput() {
        String answer = null;

        System.out.println("Would you like lemon with your tea?\n");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return answer == null ? "no" : answer;
    }
}
