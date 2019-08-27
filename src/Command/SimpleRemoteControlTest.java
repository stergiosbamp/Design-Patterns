package Command;

/**
 *  A simple remote control with one slot. In the begging it has the control for lights
 *  and then it replaces it with the control for garage door.
 *  This works because both of these commands implements the Command interface(e.g
 *  they have the "Command" as their supertype)
 */
public class SimpleRemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();

        Light light = new Light("living room");
        GarageDoor garageDoor = new GarageDoor();

        LightOnCommand lightOn = new LightOnCommand(light);
        GarageDoorUpCommand garageOpen = new GarageDoorUpCommand(garageDoor);

        simpleRemoteControl.setCommand(lightOn);
        simpleRemoteControl.buttonWasPressed();

        simpleRemoteControl.setCommand(garageOpen);
        simpleRemoteControl.buttonWasPressed();
    }
}
