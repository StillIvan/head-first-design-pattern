package com.github.stillivan.pattern.composite;

/**
 * @author Charming
 * @since 2016-09-17 23:13
 */
public class Test {
    private static void menuTest() {
        MenuComponent pancakeHouseMenu = new Menu("Pancake house menu", "Breakfast");
        MenuComponent dinerMenu = new Menu("Dinner menu", "Lunch");
        MenuComponent cafeMenu = new Menu("Cafe menu", "Dinner");
        MenuComponent dessertMenu = new Menu("Dessert menu", "Dessert of course!");

        MenuComponent allMenus = new Menu("All menus", "All menus combined.");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        dinerMenu.add(new MenuItem(
                "Pasta",
                "Spahetti with Marinara Suace, and a slice of sourdough bread.",
                true,
                3.89
        ));

        dinerMenu.add(dessertMenu);
        dessertMenu.add(new MenuItem(
                "Apple Pie",
                "Apple pie with a flakey curst, topped with vanilla ice cream",
                true,
                1.59
        ));

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
    }

    public static void main(String[] args) {
        menuTest();
    }
}
