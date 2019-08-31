package Iterator;

public class MenuItem {
    private String name;
    private String description;
    private boolean vegeterian;
    private double price;

    public MenuItem(String n, String d, boolean veg, double pr){
        name = n;
        description = d;
        vegeterian = veg;
        price = pr;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public boolean isVegeterian() {
        return vegeterian;
    }

    public String getName() {
        return name;
    }

}
