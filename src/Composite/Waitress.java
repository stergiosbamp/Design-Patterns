package Composite;

import java.util.Iterator;

public class Waitress {
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus){
        this.allMenus = allMenus;
    }

    public void printMenu(){
        allMenus.print();
    }

    public void printVegeterianMenu(){
        Iterator iterator = allMenus.createIterator();
        System.out.println("\nVEGETERIAN MENU\n----------");
        while (iterator.hasNext()){
         MenuComponent menuComponent = (MenuComponent) iterator.next();
         try {
             if (menuComponent.isVegetarian()){
                 menuComponent.print();
             }
         }catch (UnsupportedOperationException e){

         }
        }
    }

}
