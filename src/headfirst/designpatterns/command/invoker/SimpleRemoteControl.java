package headfirst.designpatterns.command.invoker;

import headfirst.designpatterns.command.commandObject.Command;

public class SimpleRemoteControl {
	Command slot;
	
	public void setCommand(Command command) {
		slot = command;
	}
	
	public void buttonWasPressed() {
		System.out.println("button pressed..");
		slot.execute();
	}
	
	public void undoButtonWasPressed() {
		System.out.println("undo pressed..");
		slot.undo();
	}
}
