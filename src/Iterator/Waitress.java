package Iterator;
import java.util.ArrayList;
import java.util.Iterator;

public class Waitress {
//    private Menu pancakeHouseMenu;
//    private Menu dinerMenu;
//    private Menu cafeMenu;

    ArrayList menus;

    /**
    public Waitress(Menu p, Menu d, Menu c){
        pancakeHouseMenu = p;
        dinerMenu = d;
        cafeMenu = c;
    }
     */
    public Waitress(ArrayList menus){
        this.menus = menus;
    }


    // creates two iterators, one for each menu
    public void printMenu(){
//        Iterator pancakeIterator = pancakeHouseMenu.createIterator();
//        Iterator dinerIterator = dinerMenu.createIterator();
//        Iterator cafeIterator = cafeMenu.createIterator();
//        System.out.println("MENU\n-----\nBREAKFAST");
//        printMenu(pancakeIterator);
//        System.out.println("\nLUNCH");
//        printMenu(dinerIterator);
//        System.out.println("\nDINNER");
//        printMenu(cafeIterator);

        Iterator menuIterator = menus.iterator();
        while (menuIterator.hasNext()){
            Menu menu = (Menu) menuIterator.next();
            printMenu(menu.createIterator());
        }

    }

    // The overloaded printMenu() method uses the
    // Iterator to step through the menu items and print them
    private void printMenu(Iterator iterator){
        while (iterator.hasNext()){
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.println(menuItem.getName() + ", ");
            System.out.println(menuItem.getPrice() + ", ");
            System.out.println(menuItem.getDescription());
        }
    }
}
