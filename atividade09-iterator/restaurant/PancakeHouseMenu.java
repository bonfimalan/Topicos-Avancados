package restaurant;

import java.util.ArrayList;
import java.util.List;

import iterator.Iterator;
import iterator.PancakeHouseIterator;

public class PancakeHouseMenu {
    private List<MenuItem> items;

    public PancakeHouseMenu() {
        items = new ArrayList<>();

        addItem("Regular Pancake Breakfast 🥞", "Pancakes with fried eggs, sausage 🥚", false, 2.99);
        addItem("Blueberry Pancake 🥞", "Pancakes made with fresh blueberries 🟦", true, 3.49);
        addItem("Waffles 🧇", "Waffles with your choice of blueberries or strawberries 🟦🍓", true, 3.59);
    }

    public void addItem(String name, String description, boolean vegertarian, double price) {
        items.add(new MenuItem(name, description, vegertarian, price));
    }

    public Iterator<MenuItem> createIterator() {
        return new PancakeHouseIterator(items);
    }
}
