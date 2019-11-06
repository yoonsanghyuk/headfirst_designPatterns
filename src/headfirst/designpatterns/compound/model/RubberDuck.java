package headfirst.designpatterns.compound.model;

import headfirst.designpatterns.compound.observer.Observable;
import headfirst.designpatterns.compound.observer.Observer;
import headfirst.designpatterns.compound.observer.Quackable;

public class RubberDuck implements Quackable{
Observable observable;
	
	public RubberDuck() {
		observable = new Observable(this);
	}
	
	public void quack() {
		System.out.println("Squeak");
		notifyObservers();
	}
	
	@Override
	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}

	@Override
	public void notifyObservers() {
		observable.notifyObservers();
	}

}
