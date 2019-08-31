package Iterator;

import java.util.Iterator;

public class DinerMenu implements Menu{
    private static final int MAX_ITEMS = 6;
    private int numberOfItems = 0;
    MenuItem[] menuItems;

    // Mel is using an Array to control
    // the max size of the menu and retrieve menu
    // items out without having to cast his objects
    public DinerMenu(){
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("Vegetarian BLT",
                "(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99);
        addItem("BLT",
                "Bacon with lettuce & tomato on whole wheat", false, 2.99);
        addItem("Soup of the day",
                "Soup of the day, with a side of potato salad", false, 3.29);
        addItem("Hotdog",
                "A hot dog, with saurkraut, relish, onions, topped with cheese",
                false, 3.05);
        addItem("Steamed Veggies and Brown Rice",
                "Steamed vegetables over brown rice", true, 3.99);
        addItem("Pasta",
                "Spaghetti with Marinara Sauce, and a slice of sourdough bread",
                true, 3.89);
    }

    public void addItem(String name, String description,
                        boolean vegetarian, double price)
    {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Sorry, menu is full!  Can't add item to menu");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems = numberOfItems + 1;
        }
    }

    //We’re not going to need the getMenuItems()
    // method anymore and in fact, we don’t want it
    // because it exposes our internal implementation

    /**
     *
    public MenuItem[] getMenuItems() {
        return menuItems;
    }

    */

    public Iterator createIterator(){
        return new DinerMenuIterator(menuItems);
    }
    // other menu methods here

}
