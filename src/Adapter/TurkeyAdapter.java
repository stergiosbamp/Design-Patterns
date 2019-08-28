package Adapter;

/**
 * Implement the interface you're adapting to
 */
public class TurkeyAdapter implements Duck {
    Turkey turkey;

    // We need to get a reference to the object
    // that we are adapting; here we do that through the constructor
    public TurkeyAdapter(Turkey t){
        turkey = t;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    // Even though both interfaces have a fly() method, Turkeys fly in
    // short spurts - they can’t do long-distance flying like ducks.
    // To map between a Duck’s fly() method and a Turkey’s, we need
    // to call the Turkey’s fly() method five times to make up for it
    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
