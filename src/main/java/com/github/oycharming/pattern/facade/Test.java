package com.github.oycharming.pattern.facade;

/**
 * @author Charming
 * @since 2016-09-07 09:43
 */
public class Test {
    static void homeTheaterFacate() throws InterruptedException {
        HomeTheaterFacade theater = new HomeTheaterFacade();
        theater.watchMovie("Titanic.");
        Thread.sleep(1000);
        theater.endMovie();
    }

    public static void main(String[] args) throws InterruptedException {
        homeTheaterFacate();
    }
}
