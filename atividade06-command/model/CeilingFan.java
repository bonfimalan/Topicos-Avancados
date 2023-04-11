package model;

public class CeilingFan extends CommandableModel {

    public CeilingFan(String room) {
        super(room);
    }

    public void on() {
        super.command("ceiling fan on ☢️");
    }

    public void off() {
        super.command("ceiling fan off ☢️");
    }
}
