package Compound;

/**
 * Let’s create a decorator that gives the ducks some new
 * behavior (the behavior of counting) by wrapping them with a
 * decorator object.
 *
 * QuackCounter is a decorator.
 */
public class QuackCounter implements Quackable{
    Quackable duck; // we have an instance variable to hold on the quacker we're decorating
    static int numberOfQuacks;

    public QuackCounter(Quackable duck){
        this.duck = duck;
    }

    //When quack() is called, we delegate the call to
    //the Quackable we’re decorating then we
    // increase the number of quacks.
    @Override
    public void quack() {
        duck.quack();
        numberOfQuacks++;
    }

    public static int getNumberOfQuacks() {
        return numberOfQuacks;
    }

    @Override
    public void registerObserver(Observer observer) {
        duck.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        duck.notifyObservers();
    }


    public String toString() {
        return duck.toString();
    }
}
