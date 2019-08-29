package TemplateMethod;

public abstract class CaffeineBeverageWithHook {
    protected final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()){
            addContiments();
        }
    }

    protected abstract void brew();

    protected abstract void addContiments();

    protected void boilWater(){
        System.out.println("Boiling water");
    }

    protected void pourInCup() {
        System.out.println("Pouring into cup");
    }

    // This is a hook method because the
    // subclass can override this method,
    // if they want.
    // It provides a default implementation
    protected boolean customerWantsCondiments(){
        return true;
    }
}
