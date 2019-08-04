package headfirst.designpatterns.strategy;

import headfirst.designpatterns.strategy.behavior.FlyRocketPowered;
import headfirst.designpatterns.strategy.duck.Duck;
import headfirst.designpatterns.strategy.duck.MallardDuck;
import headfirst.designpatterns.strategy.duck.ModelDuck;

public class MiniDuckSimulator {
	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.display();
		
		mallard.performFly();
		mallard.performQuack();
		
		
		Duck model = new ModelDuck();
		model.display();
		model.performFly();
		
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
		
	}
}
