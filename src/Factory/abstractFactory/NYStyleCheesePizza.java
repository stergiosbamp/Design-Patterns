package Factory.abstractFactory;

/**
 * No need for this concrete class. I have one class "CheesePizza"
 * for both NY style and Chicago style cheese pizza's which i instantiate them
 * with a proper ingredient factory for the particular pizza style
 */
//
//public class NYStyleCheesePizza extends Pizza {
//    PizzaIngredientFactory ingredientFactory;
//
//    public NYStyleCheesePizza(PizzaIngredientFactory pif){
//        this.ingredientFactory = pif;
//    }
//
//    @Override
//    void prepare() {
//        System.out.println("Preparing...");
//        dough = ingredientFactory.createDough();
//        sauce = ingredientFactory.createSauce();
//    }
//}
