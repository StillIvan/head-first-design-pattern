package com.github.stillivan.pattern.composite;

/**
 * @author Charming
 * @since 2016-09-17 23:12
 */
public class Waitress {
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();
    }
}
