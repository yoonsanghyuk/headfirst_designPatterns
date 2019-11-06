package headfirst.designpatterns.compound.abstractFactory;

import headfirst.designpatterns.compound.model.MallardDuck;
import headfirst.designpatterns.compound.model.RedheadDuck;
import headfirst.designpatterns.compound.model.RubberDuck;
import headfirst.designpatterns.compound.observer.QuackCounter;
import headfirst.designpatterns.compound.observer.Quackable;

public class CountingDuckFactory extends AbstractDuckFactory{
	
	@Override
	public Quackable createMallardDuck() {
		return new QuackCounter(new MallardDuck());
	}

	@Override
	public Quackable createRedheadDuck() {
		return new QuackCounter(new RedheadDuck());
	}

	@Override
	public Quackable createDuckCall() {
		return new QuackCounter(new DuckCall());
	}

	@Override
	public Quackable createRubberDuck() {
		return new QuackCounter(new RubberDuck());
	}

}
