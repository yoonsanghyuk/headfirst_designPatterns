package headfirst.designpatterns.command.commandObject;

import headfirst.designpatterns.command.receiver.GarageDoor;

public class GarageDoorOpenCommand implements Command{
	private GarageDoor garageDoor;
	
	public GarageDoorOpenCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}
	
	@Override
	public void execute() {
		garageDoor.lightOn();
		garageDoor.up();
		garageDoor.stop();
	}

	@Override
	public void undo() {
		garageDoor.lightOff();
		garageDoor.down();
		garageDoor.stop();	
	}
}
