package TemplateMethod;

public class Coffee extends CaffeineBeverage {
    @Override
    protected void brew() {
        System.out.println("Droipping coffee through filter");
    }

    @Override
    protected void addContiments() {
        System.out.println("Adding sugar and milk");
    }
}
