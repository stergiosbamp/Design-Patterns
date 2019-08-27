package Command;

/**
 * A series of commands for party mode
 */
public class MacroCommand implements Command {
    Command[] commands;

    public MacroCommand(Command[] cmds){
        commands = cmds;
    }

    @Override
    public void execute() {
        for (int i = 0; i < commands.length; i++){
            commands[i].execute();
        }
    }

    @Override
    public void undo() {
        for (int i = 0; i < commands.length; i++){
            commands[i].undo();
        }
    }
}
