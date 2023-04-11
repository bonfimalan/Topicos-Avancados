package command;

import model.GarageDoor;

public class GarageUpCommand implements Command {
    private GarageDoor door;

    public GarageUpCommand(GarageDoor door) {
        this.door = door;
    }

    @Override
    public void execute() {
        door.up();
    }

    @Override
    public void undo() {
        door.down();
    }
}
