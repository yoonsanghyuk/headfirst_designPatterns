package headfirst.designpatterns.compound.abstractFactory;

import headfirst.designpatterns.compound.observer.Observable;
import headfirst.designpatterns.compound.observer.Observer;
import headfirst.designpatterns.compound.observer.Quackable;

public class DuckCall implements Quackable{
	Observable observable;
	
	public DuckCall() {
		observable = new Observable(this);
	}
	
	public void quack() {
		System.out.println("Kwak");
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
