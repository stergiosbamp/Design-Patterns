package Decorator;

public class HouseBlend extends Beverage {

    public HouseBlend(){
        description = "House blend coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
