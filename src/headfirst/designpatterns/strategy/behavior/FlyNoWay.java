package headfirst.designpatterns.strategy.behavior;

public class FlyNoWay implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("못날아요...");
		
	}
	
}
