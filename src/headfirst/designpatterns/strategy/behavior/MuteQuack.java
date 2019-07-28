package headfirst.designpatterns.strategy.behavior;

public class MuteQuack implements QuackBehavior {

	@Override
	public void Quack() {
		System.out.println("(무음)....");

	}

}
