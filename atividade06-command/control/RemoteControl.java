package control;

import command.Command;
import command.NoCommand;

public class RemoteControl {
    private Command[] onCommands;
    private Command[] offCommands;
    private Command undoCommand;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        var noCommand = new NoCommand();
        for(int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command on, Command off) {
        onCommands[slot] = on;
        offCommands[slot] = off;
    }

    public void onButtonWasPressed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPressed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undo() {
        undoCommand.undo();
    }

    @Override
    public String toString() {
        var buffer = new StringBuffer();
        buffer.append("\n-------------- Remote Control --------------\n");
        for(int i = 0; i < onCommands.length; i++) {
            buffer.append(String.format("[slot %d] %s \t %s\n", 
                    i, onCommands[i].getClass().getName(), offCommands[i].getClass().getName()));
        }

        return buffer.toString();
    } 
}
