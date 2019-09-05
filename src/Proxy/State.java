package Proxy;

/**
 * Here’s the interface for all states. The methods map directly
 * to actions that could happen to the Gumball Machine (these are
 * the same methods as in the previous code).
 */
public interface State {
    public void insertQuarter();
    public void ejectQuarter();
    public void turnCrank();
    public void dispense();

//    public void refill();
}
