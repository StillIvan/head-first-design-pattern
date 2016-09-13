package com.github.stillivan.pattern.iterator;

/**
 * @author Charming
 * @since 2016-09-13 23:49
 */
public class Test {
    private static void menuTest() {
        DinnerMenu dinnerMenu = new DinnerMenu();
        Waitress waitress = new Waitress(dinnerMenu);
        waitress.printMenu();
    }

    public static void main(String[] args) {
        menuTest();
    }
}
