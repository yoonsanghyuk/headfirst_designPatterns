package headfirst.designpatterns.strategy.duck;

import headfirst.designpatterns.strategy.behavior.FlyBehavior;
import headfirst.designpatterns.strategy.behavior.QuackBehavior;

public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}

	public abstract void display();
	
	public void performQuack() {
		quackBehavior.Quack();
	}
	
	void swim() {
		
	}
	
	public void performFly() {
		flyBehavior.fly();
	}
}
