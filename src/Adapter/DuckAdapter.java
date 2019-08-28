package Adapter;

import java.util.Random;

public class DuckAdapter implements Turkey {
    Duck duck;
    Random random;

    public DuckAdapter(Duck d){
        duck = d;
        random = new Random();
    }

    @Override
    public void gobble() {
        duck.quack();
    }

    /**
     * Since turkeys fly a lot less than ducks
     * we need to make this fly method more rare.
     */
    @Override
    public void fly() {
        if(random.nextInt(5) == 0){
            duck.fly();
        }
    }
}
