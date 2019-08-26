package Factory.abstractFactory;

public class PepperoniPizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public PepperoniPizza(PizzaIngredientFactory pif){
        this.ingredientFactory = pif;
    }

    @Override
    void prepare() {
        System.out.println("Preparing...");
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
    }
}
