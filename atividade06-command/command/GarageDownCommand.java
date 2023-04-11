package command;

import model.GarageDoor;

public class GarageDownCommand implements Command {
    private GarageDoor door;

    public GarageDownCommand(GarageDoor door) {
        this.door = door;
    }

    @Override
    public void execute() {
        door.down();
    }

    @Override
    public void undo() {
        door.up();
    }
}
