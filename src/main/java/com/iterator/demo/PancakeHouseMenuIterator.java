package com.iterator.demo;

import java.util.ArrayList;

/**
 * @author Shawn Cao
 */
public class PancakeHouseMenuIterator<MenuItem> implements Iterator<MenuItem> {

    ArrayList<MenuItem> menuItems;
    int position = 0;
    int size = 0 ;
    public PancakeHouseMenuIterator(ArrayList menuItems) {
        this.menuItems = menuItems;
        size = menuItems.size();
    }

    @Override
    public boolean hasNext() {
        if(size > 0) return true;
        return false;
    }

    @Override
    public MenuItem next() {
        size --;
        return menuItems.get(position++);
    }
}
