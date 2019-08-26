package Factory.abstractFactory;

public class CheesePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory pif){
        this.ingredientFactory = pif;
    }

    @Override
    void prepare() {
        System.out.println("Preparing...");
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
    }
}
