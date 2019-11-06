package headfirst.designpatterns.compound;

import headfirst.designpatterns.compound.abstractFactory.AbstractDuckFactory;
import headfirst.designpatterns.compound.abstractFactory.CountingDuckFactory;
import headfirst.designpatterns.compound.adapter.GooseAdapter;
import headfirst.designpatterns.compound.composite.Flock;
import headfirst.designpatterns.compound.model.Goose;
import headfirst.designpatterns.compound.observer.QuackCounter;
import headfirst.designpatterns.compound.observer.Quackable;
import headfirst.designpatterns.compound.observer.Quackologist;

public class DuckSimulator {
	public static void main(String[] args) {
		DuckSimulator simulator = new DuckSimulator();
		AbstractDuckFactory duckFactory = new CountingDuckFactory();
		simulator.simulate(duckFactory);
	}

	private void simulate(AbstractDuckFactory duckFactory) {		
		Quackable redheadDuck = duckFactory.createRedheadDuck();
		Quackable duckCall = duckFactory.createDuckCall();
		Quackable rubberDuck = duckFactory.createRubberDuck();
		Quackable gooseDuck = new GooseAdapter(new Goose());
		System.out.println("\nDuck Simulator : With Composite - Flocks");
		
		Flock flockOfDucks = new Flock();
		
		flockOfDucks.add(redheadDuck);
		flockOfDucks.add(duckCall);
		flockOfDucks.add(rubberDuck);
		flockOfDucks.add(gooseDuck);
		
		Flock flockOfMallard = new Flock();
		
		Quackable mallardDuckOne = duckFactory.createMallardDuck();
		Quackable mallardDuckTwo = duckFactory.createMallardDuck();
		Quackable mallardDuckThree = duckFactory.createMallardDuck();
		Quackable mallardDuckFour = duckFactory.createMallardDuck();
		
		flockOfMallard.add(mallardDuckOne);
		flockOfMallard.add(mallardDuckTwo);
		flockOfMallard.add(mallardDuckThree);
		flockOfMallard.add(mallardDuckFour);
		
		flockOfDucks.add(flockOfMallard);
		
//		simulate(redheadDuck);
//		simulate(duckCall);
//		simulate(rubberDuck);
//		simulate(gooseDuck);
		System.out.println("\nDuck Simulator : Whole Flock Simulation");
		simulate(flockOfDucks);

		System.out.println("\nDuck Simulator : Mallard Flock Simulation");
		simulate(flockOfMallard);
		
		System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times");
		
		System.out.println("\nDuck Simulator : With Observer");
		Quackologist quackologist = new Quackologist();
		flockOfDucks.registerObserver(quackologist);
		
		simulate(flockOfDucks);
		
		System.out.println("\nThe ducks quacked " + QuackCounter.getQuacks() + " times");
	}

	private void simulate(Quackable duck) {
		duck.quack();
	}
	
}