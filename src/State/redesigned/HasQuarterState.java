package State.redesigned;

import java.util.Random;

public class HasQuarterState implements State {
    //we add a
    //random number
    //generator to
    //generate the 10%
    //chance of winning
    Random randomWinner = new Random(System.currentTimeMillis());
    GumballMachine gumballMachine;

    //When the state is instantiated
    //we pass it a reference to the
    //GumballMachine. This is used
    //to transition the machine to a
    //different state.
    public HasQuarterState(GumballMachine gm){
        gumballMachine = gm;
    }


    @Override
    public void insertQuarter() {
        System.out.println("You can't insert another quarter");
    }

    //Return the customer’s
    //quarter and
    //transition back to the
    //NoQuarterState
    @Override
    public void ejectQuarter() {
        System.out.println("Quarter returned");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned...");
        int winner = randomWinner.nextInt(10);
        if ((winner == 0) && (gumballMachine.getCount() > 1)){
            gumballMachine.setState(gumballMachine.getWinnerState());
        }else{
            gumballMachine.setState(gumballMachine.getSoldState());
        }
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }
}
