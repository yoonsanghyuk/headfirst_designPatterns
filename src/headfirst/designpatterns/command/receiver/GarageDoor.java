package headfirst.designpatterns.command.receiver;

public class GarageDoor {
	public void up() {
		System.out.println("GarageDoor Up");
	}
	
	public void down() {
		System.out.println("GarageDoor Down");
	}
	
	public void stop() {
		System.out.println("GarageDoor Stop");
	}
	
	public void lightOn() {
		System.out.println("GarageDoor Light On");
	}
	
	public void lightOff() {
		System.out.println("GarageDoor Light Off");
	}
}
