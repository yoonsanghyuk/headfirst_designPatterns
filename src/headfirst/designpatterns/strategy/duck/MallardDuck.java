package headfirst.designpatterns.strategy.duck;

import headfirst.designpatterns.strategy.behavior.FlyWithWings;
import headfirst.designpatterns.strategy.behavior.Quack;

public class MallardDuck extends Duck{
	
	public MallardDuck() {
		super.quackBehavior = new Quack();
		super.flyBehavior = new FlyWithWings();
	}
	
	public void display() {
		System.out.println("저는 청둥오리입니다");
	}
}
