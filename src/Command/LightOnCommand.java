package Command;

public class LightOnCommand implements Command {
    Light light;

    /**
     * Constructor is passed the light which this command will take control on
     */
    public LightOnCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
