package Strategy;

public class MallardDuck extends Duck {

    // defining that a MallardDuck will have as a quack behavior the Quack(ing)
    // and as a fly behavior flying with wings, because that's actally what it does
    public MallardDuck(){
       quackBehavior = new Quack();
       flyBehavior = new FlyWithWings();
    }

    public void display(){
        System.out.println("I'm a real Mallard duck");
    }
}
