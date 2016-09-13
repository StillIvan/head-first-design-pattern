package com.github.stillivan.pattern.iterator;

/**
 * @author Charming
 * @since 2016-09-13 23:46
 */
public class Waitress {
    DinnerMenu dinnerMenu;
    // PancakeHouseMenu pancakeHouseMenu;


    public Waitress(DinnerMenu dinnerMenu) {
        this.dinnerMenu = dinnerMenu;
    }

    public void printMenu() {
        Iterator dinnerIterator = dinnerMenu.createIterator();
        printMenu(dinnerIterator);
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + ", ");
            System.out.println(menuItem.getDescription());
        }
    }
}
