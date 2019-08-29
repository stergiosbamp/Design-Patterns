package TemplateMethod;

public class BeverageTestDrive {
    public static void main(String[] args) {
        Tea tea = new Tea();
        // The prepareRecipe() method controls
        // the algorithm, no one can change this,
        // and it counts on subclasses to provide
        // some or all of the implementation.
        tea.prepareRecipe();


        TeaBeverageWithHook teaHook = new TeaBeverageWithHook();
        CoffeeWithHook coffeeHook = new CoffeeWithHook();

        System.out.println("Making tea...");
        teaHook.prepareRecipe();

        System.out.println("Making coffee");
        coffeeHook.prepareRecipe();
    }
}
