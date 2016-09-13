package com.github.stillivan.pattern.iterator;

/**
 * @author Charming
 * @since 2016-09-13 23:38
 */
public class DinnerMenu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinnerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("Vegetarian BLT", "Bacon with lettuce", true, 2.99);
        addItem("BLT", "Bacon with lettuce & tomato", false, 2.99);
        addItem("Soup of the day", "Soup of the day", false, 3.29);
        addItem("Hot dog", "A hot dog, with saurkraut, relish.", false, 3.05);
    }

    public Iterator createIterator() {
        return new DinnerMenuIterator(menuItems);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Sorry, menu is full!");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems++;
        }
    }

    public MenuItem[] getMenuItems() {
        return menuItems;
    }
}
