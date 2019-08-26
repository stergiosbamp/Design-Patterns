package Factory.simpleFactory;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    protected String name;

    // These 2 properties are for preferences about pizza in various places of people
    // Others like it with thin dough, others with thick. Same goes for sauce too.

//    protected String dough;
//    protected String sauce;

    protected List<String> ingredients = new ArrayList<>();

    public void prepare(){
        System.out.println("Preparing...");
    }

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
