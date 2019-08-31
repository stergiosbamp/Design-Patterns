package Iterator;

import java.util.HashMap;
import java.util.Iterator;


public class CafeMenu implements Menu {
    // By default it uses a HashMap to store the menu items
    HashMap menuItems = new HashMap<>();

    public CafeMenu(){
        addItem("Veggie Burger and Air Fries",
                "Veggie burger on a whole wheat bun, lettuce, tomato, and fries",
                true, 3.99);
        addItem("Soup of the day",
                "A cup of the soup of the day, with a side salad",
                false, 3.69);
        addItem("Buritto",
                "A large burrito, with whole pinto beans, salsa, guacamole",
                true, 3.69);
    }

    // The key is the menuItem name and the value the menuItem object
    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.put(menuItem.getName(), menuItem);
    }


    @Override
    public Iterator createIterator() {
        return menuItems.values().iterator();
    }
}
