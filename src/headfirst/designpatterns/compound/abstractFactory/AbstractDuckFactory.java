package headfirst.designpatterns.compound.abstractFactory;

import headfirst.designpatterns.compound.observer.Quackable;

public abstract class AbstractDuckFactory {
	public abstract Quackable createMallardDuck();
	public abstract Quackable createRedheadDuck();
	public abstract Quackable createDuckCall();
	public abstract Quackable createRubberDuck();
	
}
