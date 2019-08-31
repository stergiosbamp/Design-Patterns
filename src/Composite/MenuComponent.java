package Composite;

import java.util.Iterator;

/**
 * MenuComponent represents the interface for both MenuItem and Menu.
 * We’ve used an abstract class here because we want to
 * provide default implementations for these methods
 */
public abstract class MenuComponent {
    /**
     * Because some of these methods only make sense for MenuItems,
     * and some only make sense for Menus, the default implementation
     * is  UnsupportedOperationException.  That way, if MenuItem or Menu
     * doesn’t support an operation, they don’t have to do anything,
     * they can just inherit the  default implementation.
     */
    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }
    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }
    public MenuComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }

    public String getName() {
        throw new UnsupportedOperationException();
    }
    public String getDescription() {
        throw new UnsupportedOperationException();
    }
    public double getPrice() {
        throw new UnsupportedOperationException();
    }
    public boolean isVegetarian() {
        throw new UnsupportedOperationException();
    }

    public abstract Iterator<MenuComponent> createIterator();

    public void print() {
        throw new UnsupportedOperationException();
    }

}
