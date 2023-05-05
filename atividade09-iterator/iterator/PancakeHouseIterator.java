package iterator;

import java.util.List;

import restaurant.MenuItem;

public class PancakeHouseIterator implements Iterator<MenuItem> {
    private List<MenuItem> items;
    private int position = 0;

    public PancakeHouseIterator(List<MenuItem> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return position < items.size();
    }

    @Override
    public MenuItem next() {
        return items.get(position++);
    }
}
