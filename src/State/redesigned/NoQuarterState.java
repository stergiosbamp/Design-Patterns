package State.redesigned;

public class NoQuarterState implements State {
    GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gm){
        gumballMachine = gm;
    }

    //
    @Override
    public void insertQuarter() {
        //If someone inserts a quarter,
        //we print a message saying the
        //quarter was accepted and then
        //change the machine’s state to
        //the HasQuarterState.
        System.out.println("You inserted a quarter");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You haven't inserted a quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned but there is no quarter");
    }

    @Override
    public void dispense() {
        System.out.println("You need to pay first");
    }

//    @Override
//    public void refill() {
//
//    }
}
