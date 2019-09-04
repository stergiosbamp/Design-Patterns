package State;

public class GumballMachine {
    // These are the four states
    final static int SOLD_OUT = 0;
    final static int NO_QUARTER = 1;
    final static int HAS_QUARTER = 2;
    final static int SOLD = 3;

    int state = SOLD_OUT; //keeps track of current state, we start with SOLD_OUT
    int count = 0;

    /**
     * The constructor takes an initial
     * inventory of gumballs. If the inventory
     * isn’t zero, the machine enters state
     * NO_QUARTER, meaning it is waiting for
     * someone to insert a quarter, otherwise it
     * stays in the SOLD_OUT state.
     */
    public GumballMachine(int count){
        this.count = count;
        if(count>0){
            state = NO_QUARTER;
        }
    }

    public void insertQuarter(){
        if (state == HAS_QUARTER){
            System.out.println("You can't insert another quarter");
        }else if (state == NO_QUARTER){
            // We accept the quarter and transition
            // to the HAS_QUARTER state
            state = HAS_QUARTER;
            System.out.println("You inserted a quarter");
        }else if (state == SOLD_OUT){
            System.out.println("You can't insert a quarter, the machine is sold out");
        }else if (state == SOLD){
            System.out.println("Please wait, we're already giving you a gumball");
        }
    }

    // Now if the customer tries to remove the quarter
    public void ejectQuarter() {
        if (state == HAS_QUARTER){
            // If there is a quarter, we
            // return it and go back to
            // the NO_QUARTER state.
            System.out.println("Quarter returned");
            state = NO_QUARTER;
        }else if (state == NO_QUARTER){
            System.out.println("You haven't inserted a quarter");
        }else if (state == SOLD){
            //If the customer just
            //turned the crank, we can’t
            //give a refund; he already
            //has the gumball!
            System.out.println("Sorry, you already turned the crank");
        }else if (state == SOLD_OUT){
            System.out.println("You can’t eject, you haven’t inserted a quarter yet");
        }
    }

    public void turnCrank(){
        if (state == SOLD) {
            System.out.println("Turning twice doesn’t get you another gumball!");
        } else if (state == NO_QUARTER) {
            System.out.println("You turned but there’s no quarter");
        } else if (state == SOLD_OUT) {
            System.out.println("You turned, but there are no gumballs");
        } else if (state == HAS_QUARTER) {
            //Success! They get a gumball. Change
            //the state to SOLD and call the
            //machine’s dispense() method.
            System.out.println("You turned...");
            state = SOLD;
            dispense();
        }
    }

    private void dispense() {
        if (state == SOLD){
            System.out.println("A gumball comes rolling out the slot");
            count--;
            //Here’s where we handle the
            //“out of gumballs” condition:
            //If this was the last one, we
            //set the machine’s state to
            //SOLD_OUT; otherwise, we’re
            //back to not having a quarter
            if (count == 0){
                System.out.println("Oops, out of gumballs");
                state = SOLD_OUT;
            }else {
                state = NO_QUARTER;
            }
        }
        // None of these should ever happen
        // but if they do, we give 'em an error
        // not a gumball
        else if (state == NO_QUARTER) {
            System.out.println("You need to pay first");
        } else if (state == SOLD_OUT) {
            System.out.println("No gumball dispensed");
        } else if (state == HAS_QUARTER) {
            System.out.println("No gumball dispensed");
        }
    }

    // other methods here like toString() and refill()

    public void refill(int numGumBalls) {
        this.count = numGumBalls;
        state = NO_QUARTER;
    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nMighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #2004\n");
        result.append("Inventory: " + count + " gumball");
        if (count != 1) {
            result.append("s");
        }
        result.append("\nMachine is ");
        if (state == SOLD_OUT) {
            result.append("sold out");
        } else if (state == NO_QUARTER) {
            result.append("waiting for quarter");
        } else if (state == HAS_QUARTER) {
            result.append("waiting for turn of crank");
        } else if (state == SOLD) {
            result.append("delivering a gumball");
        }
        result.append("\n");
        return result.toString();
    }
}
