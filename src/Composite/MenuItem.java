package Composite;

import java.util.Iterator;

public class MenuItem extends MenuComponent {
    private String name;
    private String description;
    boolean vegeterian;
    double price;

    public MenuItem(String name, String description, boolean vegeterian, double price){
        this.name = name;
        this.description = description;
        this.vegeterian = vegeterian;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public boolean isVegetarian() {
        return vegeterian;
    }

    @Override
    public Iterator createIterator() {
        return new NullIterator();
    }

    @Override
    public void print() {
        System.out.println(" " + getName());
        if(isVegetarian()){
            System.out.print("(v)");
        }
        System.out.print(", " + getPrice());
        System.out.print("   ---- " + getDescription());
    }
}

