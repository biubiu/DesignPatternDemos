package com.iterator.demo;

/**
 * @author Shawn Cao
 */
public class DinerMenuIterator<MenuItem> implements Iterator<MenuItem> {
    int current = 0;

    MenuItem[] menuItems;
    int size = 0;
    public DinerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
        size = menuItems.length;
    }

    @Override
    public boolean hasNext() {
        return size>0;
    }

    @Override
    public MenuItem next() {
        size --;
        return menuItems[current++];

    }
}
