package Factory.abstractFactory;

public abstract class PizzaStore {

    public Pizza orderPizza(String type){
        Pizza pizza;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    // We're making the actual factory method (the one who
    // actually produces the pizzas) abstract.
    // All the responsibility for instantiating Pizzas
    // has been moved into a method that acts as a factory
    public abstract Pizza createPizza(String type);

    // other methods...
}
