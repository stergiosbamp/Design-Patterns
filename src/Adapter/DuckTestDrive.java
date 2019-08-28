package Adapter;

public class DuckTestDrive {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        WildTurkey wildTurkey = new WildTurkey();

        // Wrapping the wildTurkey to make to look like a Duck
        Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);

        System.out.println("The turkey says: ");
        wildTurkey.gobble();
        wildTurkey.fly();

        System.out.println("\nThe duck says: ");
        testDuck(mallardDuck);

        System.out.println("\nThe turkey that trying to look like a Duck says: ");
        testDuck(turkeyAdapter); //testDuck is expecting a Duck object. It works

        System.out.println("\nThe duck that wants to become a turkey: ");
        Turkey duckAdapter = new DuckAdapter(mallardDuck);
        testTurkey(duckAdapter);
    }

    public static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }

    public static void testTurkey(Turkey turkey){
        turkey.gobble();
        turkey.fly();
    }
}
