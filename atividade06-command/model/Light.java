package model;

public class Light extends CommandableModel {
    public Light(String room) {
        super(room);
    }

    public void on() {
        super.command("light on 💡");
    }

    public void off() {
        super.command("light off 💡");
    }
}
