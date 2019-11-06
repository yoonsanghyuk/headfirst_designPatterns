package headfirst.designpatterns.compound.abstractFactory;

import headfirst.designpatterns.compound.model.MallardDuck;
import headfirst.designpatterns.compound.model.RedheadDuck;
import headfirst.designpatterns.compound.model.RubberDuck;
import headfirst.designpatterns.compound.observer.Quackable;

public class DuckFactory extends AbstractDuckFactory{

	@Override
	public Quackable createMallardDuck() {
		return new MallardDuck();
	}

	@Override
	public Quackable createRedheadDuck() {
		return new RedheadDuck();
	}

	@Override
	public Quackable createDuckCall() {
		return new DuckCall();
	}

	@Override
	public Quackable createRubberDuck() {
		return new RubberDuck();
	}

}
