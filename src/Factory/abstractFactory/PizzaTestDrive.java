package Factory.abstractFactory;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();

        // Just cheese and pepperoni pizza's are implemented.

        // Ordering a NY style cheese pizza
        Pizza nyCheesePizza = nyPizzaStore.orderPizza("cheese");
        System.out.println("Pizza ready named: " + nyCheesePizza.name);

        // Making a pepperoni pizza for NY also
        Pizza pepperoniNYPizza = nyPizzaStore.orderPizza("pepperoni");
        System.out.println("Pizza ready named: " + pepperoniNYPizza.name);

        // Ordering a Chicago style pepperoni pizza too
        Pizza chicagoPepperoniPizza = chicagoPizzaStore.orderPizza("pepperoni");
        System.out.println("Pizza ready named: " + chicagoPepperoniPizza.name);

    }
}
