package Compound;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingFactory();

        simulator.simulate(duckFactory);
    }

    private void simulate(AbstractDuckFactory duckFactory) {

        /*
        we must wrap each Quackable object we instantiate in a
        QuackCounter decorator. If we don’t, we’ll have ducks running
        around making uncounted quacks.
         */
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();

        // we don't want to count geese honks, so we dont decorate it
        Quackable gooseDuck = new GooseAdapter(new Goose());

        System.out.println("\nDuck Simulator: ");

        Flock flockOfDucks = new Flock();
        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(gooseDuck);

        //We're creating a little family of mallards...
        Flock flockOfMallards = new Flock();

        Quackable mallardOne = duckFactory.createMallardDuck();
        Quackable mallardTwo = duckFactory.createMallardDuck();
        Quackable mallardThree = duckFactory.createMallardDuck();
        Quackable mallardFour = duckFactory.createMallardDuck();

        flockOfMallards.add(mallardOne);
        flockOfMallards.add(mallardTwo);
        flockOfMallards.add(mallardThree);
        flockOfMallards.add(mallardFour);

//        simulate(mallardDuck);
//        simulate(redheadDuck);
//        simulate(duckCall);
//        simulate(rubberDuck);
//
//        simulate(gooseDuck);

        System.out.println("\nDuck Simulator: ");
        Quackologist quackologist = new Quackologist();
        flockOfDucks.registerObserver(quackologist);

        simulate(flockOfDucks);

//        System.out.println("\nDuck Simulator: Mallard Flock Simulation");
//        simulate(flockOfMallards);

        System.out.println("The ducks quacker " + QuackCounter.getNumberOfQuacks() + " times");
    }

    //Here we let polymorphism do its magic: no
    //matter what kind of Quackable gets passed in,
    //the simulate() method asks it to quack.
    private void simulate(Quackable duck){
        duck.quack();
    }
}
