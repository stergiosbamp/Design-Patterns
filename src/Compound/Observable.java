package Compound;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * This is a helper class, to avoid implementing registration
 * and notification in each and every concrete class.
 *
 * This class implements all the functionality
 * a Quackable needs to be an observable.
 * We just need to plug it into a class and
 * have that class delegate to Observable.
 */
public class Observable implements QuackObservable {
    ArrayList observers = new ArrayList();
    QuackObservable duck;

    public Observable(QuackObservable duck){
        this.duck = duck;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        Iterator iterator = observers.iterator();
        while (iterator.hasNext()){
            Observer observer = (Observer) iterator.next();
            observer.update(duck);
        }
    }
}
