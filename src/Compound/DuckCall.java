package Compound;

/*
A DuckCall that quacks but doesn’t
sound quite like the real thing. A thing hunters' using
 */
public class DuckCall implements Quackable {
    Observable observable;

    public DuckCall() {
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Kwak");
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);

    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();

    }

    public String toString() {
        return "Duck Call";
    }
}
