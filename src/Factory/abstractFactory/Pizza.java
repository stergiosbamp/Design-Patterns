package Factory.abstractFactory;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    protected String name;
    protected Dough dough;
    protected Sauce sauce;

    protected List<String> ingredients = new ArrayList<>();

    /**
     * We’ve now made the prepare method abstract.  This is where we are
     * going to collect the ingredients needed for the pizza,
     * which of course will come from the ingredient factory.
     */
    abstract void prepare();

    public void bake(){
        System.out.println("Baking...");
    }

    public void cut(){
        System.out.println("Cutting...");
    }

    public void box(){
        System.out.println("Boxing...");
    }
}
