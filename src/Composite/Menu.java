package Composite;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Menu is also a MenuComponent just like MenuItem.
 * There's a couple of methods from MenuComponent this class doesn't
 * implement : getPrice() and isVegeterian() because they dont make sence
 * for a Menu
 */
public class Menu extends MenuComponent {
    // Menu can have any number of children of type MenuComponent,
    // we'll use an internal ArrayList to hold these
    ArrayList menuComponents = new ArrayList();
    // This is different than our old implementation: we’re going
    // to give each Menu a name and a description.
    // Before, we just relied on having different classes for each menu.
    String name;
    String description;

    // One iterator per menu
    Iterator iterator = null;


    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return (MenuComponent) menuComponents.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    // Here we’re using a new iterator called CompositeIterator.
    // It knows how to iterate over any composite.
    @Override
    public Iterator<MenuComponent> createIterator() {
        if (iterator == null) {
            iterator = new CompositeIterator(menuComponents.iterator());
        }
        return iterator;
    }


    // Notice, we aren’t overriding getPrice() or isVegetarian()
    // because those methods don’t make sense for a Menu
    // (although you could argue that isVegetarian() might make sense).
    // If someone tries to call those methods on a Menu, they’ll get an UnsupportedOperationException.


    @Override
    public void print() {
        System.out.print("\n" + getName());
        System.out.println(", " + getDescription());
        System.out.println("----------------");

        // All we need to do is change the print() method to make it print not only the information
        // about this Menu, but all of this Menu’s components: other Menus and MenuItems.
        Iterator iterator = menuComponents.iterator();
        while(iterator.hasNext()){
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            menuComponent.print();
        }
    }
}
