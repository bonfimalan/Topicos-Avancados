package model;

public class CommandableModel {
    private String room;

    public CommandableModel(String room) {
        this.room = room;
    }

    public void command(String commandDescription) {
        System.out.println(room + ": " + commandDescription);
    }
}
