package Command;

/**
 * Assume this simple remote control has only one slot
 */
public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl(){}

    public void setCommand(Command cmd){
        this.slot = cmd;
    }

    // This method is called when button is pressed
    public void buttonWasPressed(){
        slot.execute();
    }
}
