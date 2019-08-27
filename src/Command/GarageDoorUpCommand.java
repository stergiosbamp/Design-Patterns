package Command;

/**
 * This is a command for calling the GaradeDoor's up() method. E.g opening the door
 */
public class GarageDoorUpCommand implements Command {
    GarageDoor garageDoor;

    public GarageDoorUpCommand(GarageDoor gd){
        this.garageDoor = gd;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }

    @Override
    public void undo() {
        garageDoor.down();
    }
}
