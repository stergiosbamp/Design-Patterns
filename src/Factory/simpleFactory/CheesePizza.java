package Factory.simpleFactory;

public class CheesePizza extends Pizza{
    public CheesePizza(){
        name = "Cheese pizza";
        ingredients.add("Parmesan");
        ingredients.add("Gouda");
    }
}
