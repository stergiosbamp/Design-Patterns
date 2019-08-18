package Strategy;

public abstract class Duck {
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    public Duck(){}

    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    public void swim(){
        System.out.println("All ducks float, even decoys.");
    }

    // method to change fly behavior on-the-fly (e.g. at runtime)
    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb;
    }

    // method to change quack behavior on-the-fly (e.g. at runtime)
    public void setQuackBehavior(QuackBehavior qb){
        quackBehavior = qb;
    }


}
