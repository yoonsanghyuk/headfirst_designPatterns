package headfirst.designpatterns.command;

import headfirst.designpatterns.command.commandObject.Command;
import headfirst.designpatterns.command.commandObject.GarageDoorCloseCommand;
import headfirst.designpatterns.command.commandObject.GarageDoorOpenCommand;
import headfirst.designpatterns.command.commandObject.LightOffCommand;
import headfirst.designpatterns.command.commandObject.LightOnCommand;
import headfirst.designpatterns.command.commandObject.MacroCommand;
import headfirst.designpatterns.command.invoker.SimpleRemoteControl;
import headfirst.designpatterns.command.receiver.GarageDoor;
import headfirst.designpatterns.command.receiver.Light;

public class RemoteControlClient {

	public static void main(String[] args) {
		SimpleRemoteControl remote = new SimpleRemoteControl();
		Light light = new Light();
		GarageDoor garageDoor = new GarageDoor();
		LightOnCommand lightOn = new LightOnCommand(light);
		LightOffCommand lightOff = new LightOffCommand(light);
		GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);
		GarageDoorCloseCommand garageClose = new GarageDoorCloseCommand(garageDoor);
		
		
		remote.setCommand(lightOn);
		remote.buttonWasPressed();
		remote.setCommand(lightOff);
		remote.buttonWasPressed();
		remote.undoButtonWasPressed();
		
		
		remote.setCommand(garageOpen);
		remote.buttonWasPressed();
		remote.undoButtonWasPressed();
		
		remote.setCommand(garageClose);
		remote.buttonWasPressed();
		
		
		// for macro
		Command[] onCommands = {lightOn, garageOpen};
		MacroCommand macro = new MacroCommand(onCommands);
		
		remote.setCommand(macro);
		remote.buttonWasPressed();
	}

}
