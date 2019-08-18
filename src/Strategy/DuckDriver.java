package Strategy;

public class DuckDriver {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();

        mallard.performFly();
        mallard.performQuack();

        //another duck
        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyingRocket()); //changing duck' way to fly
        model.performFly();
    }
}
