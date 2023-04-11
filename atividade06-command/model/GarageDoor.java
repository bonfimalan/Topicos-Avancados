package model;

public class GarageDoor extends CommandableModel{

    public GarageDoor() {
        super("Garage door");
    }
    
    public void up() {
        super.command("up 🚪");
    }

    public void down() {
        super.command("down 🚪");
    }
}
