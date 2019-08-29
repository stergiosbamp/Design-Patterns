package TemplateMethod;

/**
 * Tea needs to define brew() and addCondiments()
 */
public class Tea extends CaffeineBeverage {
    @Override
    protected void brew() {
        System.out.println("Stepping the tea");
    }

    @Override
    protected void addContiments() {
        System.out.println("Adding lemon");
    }
}
