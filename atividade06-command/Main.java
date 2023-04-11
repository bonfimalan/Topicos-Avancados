import command.CeilingFanOffCommand;
import command.CeilingFanOnCommand;
import command.GarageDownCommand;
import command.GarageUpCommand;
import command.LightOffCommand;
import command.LightOnCommand;
import control.RemoteControl;
import model.CeilingFan;
import model.GarageDoor;
import model.Light;

public class Main {
    public static void main(String[] args) {
        var remote = new RemoteControl();

        var kitchenLight = new Light("Kitchen");
        var livingRoomLight = new Light("Living Room");
        var livingRoomCeilingFan = new CeilingFan("Living Room");
        var garageDoor = new GarageDoor();

        var kitchenLightOnCommand = new LightOnCommand(kitchenLight);
        var kitchenLightOffCommand = new LightOffCommand(kitchenLight);
        var livingRoomLightOnCommand = new LightOnCommand(livingRoomLight);
        var livingRoomLightOffCommand = new LightOffCommand(livingRoomLight);
        var livingRoomCeilingOnFanCommand = new CeilingFanOnCommand(livingRoomCeilingFan);
        var livingRoomCeilingOffFanCommand = new CeilingFanOffCommand(livingRoomCeilingFan);
        var garageDoorUpCommand = new GarageUpCommand(garageDoor);
        var garageDoorDownCommand = new GarageDownCommand(garageDoor);

        remote.setCommand(0, kitchenLightOnCommand, kitchenLightOffCommand);
        remote.setCommand(1, livingRoomLightOnCommand, livingRoomLightOffCommand);
        remote.setCommand(2, livingRoomCeilingOnFanCommand, livingRoomCeilingOffFanCommand);
        remote.setCommand(3, garageDoorUpCommand, garageDoorDownCommand);

        System.out.println(remote.toString());

        remote.onButtonWasPressed(0);
        remote.offButtonWasPressed(0);
        remote.undo();
        remote.onButtonWasPressed(1);
        remote.offButtonWasPressed(1);
        remote.onButtonWasPressed(2);
        remote.offButtonWasPressed(2);
        remote.onButtonWasPressed(3);
        remote.offButtonWasPressed(3);
    }
}