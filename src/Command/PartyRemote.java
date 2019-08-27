package Command;

public class PartyRemote {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();

        Light light = new Light("Living room");
        TV tv = new TV("Living Room");
        Stereo stereo = new Stereo("Living room");

        // create the commands for the ON party mode
        LightOnCommand lightOn = new LightOnCommand(light);
        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        TVOnCommand tvOn = new TVOnCommand(tv);

        Command[] partyOn = {lightOn, stereoOnWithCD, tvOn};

        // create the commands for the OFF party mode
        LightOffCommand lightOff = new LightOffCommand(light);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);
        TVOffCommand tvOff = new TVOffCommand(tv);

        Command[] partyOff = {lightOff, stereoOff, tvOff};


        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        //assign them to remote
        remote.setCommand(0, partyOnMacro, partyOffMacro);

        // push the ON and OFF buttons
        System.out.println("Party mode ON:");
        remote.onButtonPushed(0);
        System.out.println("");
        System.out.println("Party mode OFF:");
        remote.offButtonPushed(0);
    }
}
