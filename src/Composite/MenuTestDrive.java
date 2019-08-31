package Composite;

public class MenuTestDrive {
    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");
        MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");
        MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert of course!");

        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        dinerMenu.add(new MenuItem("Pasta",
                "Spaghetti with Marinara sauce",true,3.89));

        // We're addinga Menu to a menu (eg a sub-menu which was the whole point)
        // All dinerMenu cares about is that everything it holds whether it's a menu item
        // or a menu is of type MenuComponent
        dinerMenu.add(dessertMenu);

        dessertMenu.add(new MenuItem("Apple pie",
                "Apple pie with a crust", true, 1.59));

        Waitress waitress = new Waitress(allMenus);
//        waitress.printMenu();
        waitress.printVegeterianMenu();
    }
}
