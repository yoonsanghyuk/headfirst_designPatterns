package headfirst.designpatterns.compound.model;

import headfirst.designpatterns.compound.observer.Observable;
import headfirst.designpatterns.compound.observer.Observer;
import headfirst.designpatterns.compound.observer.Quackable;

public class MallardDuck implements Quackable{
	Observable observable;
	
	public MallardDuck() {
		observable = new Observable(this);
	}
	
	public void quack() {
		System.out.println("Quack");
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
