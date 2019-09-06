package Compound;

/**
 * Our simulator expects to see Quackable interfaces. Since geese
 * aren’t quackers (they’re honkers), we can use an adapter to adapt
 * a goose to a duck.
 */
public class GooseAdapter implements Quackable{
    Goose goose;
    Observable observable;

    public GooseAdapter(Goose goose){
        this.goose = goose;
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        goose.honk();
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
}
