package Decorator;


public class Mocha extends CondimentDecorator {

    //a reference to a Beverage using
    // an instance variable to hold the beverage we are wrapping
    private Beverage beverage;

    // we’re going to to pass the beverage we’re wrapping to the decorator’s constructor.
    public Mocha(Beverage bvrg){
        this.beverage = bvrg;
    }


    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.20;
    }
}
