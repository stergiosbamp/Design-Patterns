package Factory.simpleFactory;

public class VeggiePizza extends Pizza {
    public VeggiePizza(){
        name = "Veggie Pizza";
        ingredients.add("Vegan Cheese");
        ingredients.add("Tomato sauce");
    }
}
