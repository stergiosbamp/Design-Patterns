package Decorator;

public class CoffeeDriver {
    public static void main(String[] args) {
        // Order up an espresso, no condiments and print its description and cost
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        // a house blend cofee with Soy, Mocha, and Whip
        Beverage beverage2 = new HouseBlend();
        beverage2 = new Soy(beverage2); //wrap it with Soy
        beverage2 = new Mocha(beverage2); //wrap it with Mocha
        beverage2 = new Whip(beverage2); //wrap it with whip

        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
    }
}
