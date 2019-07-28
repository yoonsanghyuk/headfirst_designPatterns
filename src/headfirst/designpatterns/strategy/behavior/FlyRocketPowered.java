package headfirst.designpatterns.strategy.behavior;

public class FlyRocketPowered implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("로켓으로 날아갑니다~!");
		
	}

}
