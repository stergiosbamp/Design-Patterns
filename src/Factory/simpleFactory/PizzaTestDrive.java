package Factory.simpleFactory;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore(new SimplePizzaFactory());

        //Ordering a cheese pizza
        Pizza pizza = pizzaStore.orderPizza("cheese");
        System.out.println("Ordered " + pizza.name);
        //Ordering a veggie pizza
        Pizza pizza2 = pizzaStore.orderPizza("veggie");
        System.out.println("Ordered " + pizza.name);
    }
}
