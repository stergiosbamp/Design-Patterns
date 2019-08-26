package Factory.abstractFactory;

public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory nyIngredientFactory = new NYPizzaIngredientFactory();

        if(type.equals("cheese")){
            pizza = new CheesePizza(nyIngredientFactory);
            pizza.name = "New York style cheese pizza";
        }
        // similar for other types of Pizza too


        else if(type.equals("pepperoni")){
//            return new NYStylePepperoniPizza();
            pizza = new PepperoniPizza(nyIngredientFactory);
            pizza.name = "New York style pepperoni pizza";
        }
        /*
        else if(type.equals("clam")){
            return new NYStyleClamPizza();
        }else if(type.equals("veggie")){
            return new NYStyleVeggiePizza();
        }
        */
        return pizza;
    }
}
