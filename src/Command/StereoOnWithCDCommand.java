package Command;

public class StereoOnWithCDCommand implements Command {
    Stereo stereo;

    public StereoOnWithCDCommand(Stereo s){
        stereo = s;
    }

    /**
     * To carry out this request, we need to call
     * three methods on the stereo: first, turn it on,
     * then set it to play the CD, and finally set the volume to 11
     */
    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
