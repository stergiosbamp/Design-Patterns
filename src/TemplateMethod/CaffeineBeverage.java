package TemplateMethod;

public abstract class CaffeineBeverage {

    // Now the same prepareRecipe() method will be used to make
    // both Tea and Coffee.  prepareRecipe() is declared final
    // because we don’t want our subclasses to be able to override this method and change the recipe!
    // We’ve generalized steps 2 and 4 to brew() the beverage and addCondiments().

    // This is the "template method"
    protected final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        addContiments();
    }

    // Because Coffee and Tea handle these methods
    // in different ways, they're going to be abstract.
    // Let the subclasses worry about that stuff
    protected abstract void brew();

    protected abstract void addContiments();

    protected void boilWater(){
        System.out.println("Boiling water");
    }

    protected void pourInCup(){
        System.out.println("Pouring into cup");
    }
}
