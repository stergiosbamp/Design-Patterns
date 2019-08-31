package Iterator;

import java.util.ArrayList;

/**
 * Unused class since i'm using the Iterator Java API
 */
public class PancakeHouseIterator implements Iterator {
    ArrayList menuItems;
    int position = 0;


    public PancakeHouseIterator(ArrayList items){
        menuItems = new ArrayList();
        menuItems = items;
    }

    @Override
    public boolean hasNext() {
        if (position >= menuItems.size() || menuItems.get(position) == null){
            return false;
        }else
            return true;
    }

    @Override
    public Object next() {
         Object menuItem = menuItems.get(position);
         position++;
         return menuItem;
    }
}
