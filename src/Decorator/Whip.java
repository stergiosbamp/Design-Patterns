package Decorator;

public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage b){
        this.beverage = b;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.10;
    }
}
