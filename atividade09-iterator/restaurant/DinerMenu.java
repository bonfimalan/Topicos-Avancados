package restaurant;

import iterator.DinerMenuIterator;
import iterator.Iterator;

public class DinerMenu {
    private static final int MAX_ITEMS = 6;
    private int numberOfItems = 0;
    private MenuItem[] items;

    public DinerMenu() {
        items = new MenuItem[MAX_ITEMS];

        addItem("Vegetarian BLT", "Fakin Bacon with lettuce & tomato on whole wheat 🥓🥬🍅", true, 2.99);
        addItem("BLT", "Bacon with lettuce & tomato on whole wheat 🥓🥬🍅", false, 2.99);
        addItem("Soup of the day 🥣", "Soup of the day, with a side of potato salad 🥣🥔🥗", false, 3.29);
        addItem("Hotdog 🌭", "A hot dog, with saurkraut, relish, onion, topped with cheese 🌭🧅🧀", false, 3.05);
    }

    public void addItem(String name, String description, boolean vegertarian, double price) {
        if(numberOfItems >= MAX_ITEMS) {
            System.out.println("Menu is full 😞");
            return;
        }

        items[numberOfItems] = new MenuItem(name, description, vegertarian, price);
        numberOfItems++;
    }


    public Iterator<MenuItem> createIterator() {
        return new DinerMenuIterator(items);
    }
}
