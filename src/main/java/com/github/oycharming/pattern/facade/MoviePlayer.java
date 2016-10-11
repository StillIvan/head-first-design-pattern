package com.github.oycharming.pattern.facade;

/**
 * @author Charming
 * @since 2016-09-07 09:38
 */
public class MoviePlayer {
    public void on() {
        System.out.println("The movie player is on.");
    }

    public void off() {
        System.out.println("The movie player is off.");
    }

    public void play(String movie) {
        System.out.println("Begin play " + movie + ".");
    }
}
