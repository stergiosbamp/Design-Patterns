package Factory.abstractFactory;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory chicagoIngredientFactory = new ChicagoPizzaIngredientFactory();

        if(type.equals("pepperoni")){
            pizza = new PepperoniPizza(chicagoIngredientFactory);
            pizza.name = "Chicago pepperoni style pizza";
        }
        // similar for other types of Pizza too

        /*
            return new NYStylePepperoniPizza();
        }else if(type.equals("clam")){
            return new NYStyleClamPizza();
        }else if(type.equals("veggie")){
            return new NYStyleVeggiePizza();
        }
        */
        return pizza;
    }
}
