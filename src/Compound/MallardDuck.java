package Compound;


public class MallardDuck implements Quackable {
    Observable observable;

    public MallardDuck(){
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Quack");
        notifyObservers();
    }

    // we're delegating to the helper
    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    // we're delegating to the helper
    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}
