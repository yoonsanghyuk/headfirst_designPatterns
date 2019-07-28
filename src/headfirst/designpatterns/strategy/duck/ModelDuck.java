package headfirst.designpatterns.strategy.duck;

import headfirst.designpatterns.strategy.behavior.FlyNoWay;
import headfirst.designpatterns.strategy.behavior.Quack;

public class ModelDuck extends Duck{
	
	public ModelDuck(){
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}
	
	@Override
	public void display() {
		System.out.println("저는 모형 오리입니다~");
		
	}
	
	
}
