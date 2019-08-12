package headfirst.designpatterns.command.commandObject;

import headfirst.designpatterns.command.receiver.GarageDoor;

public class GarageDoorCloseCommand implements Command{
	private GarageDoor garageDoor;
	
	public GarageDoorCloseCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}
	
	@Override
	public void execute() {
		garageDoor.lightOff();
		garageDoor.down();
		garageDoor.stop();
	}

	@Override
	public void undo() {
		garageDoor.lightOn();
		garageDoor.up();
		garageDoor.stop();
	}
	
}
