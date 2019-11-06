package headfirst.designpatterns.compound.composite;

import java.util.ArrayList;
import java.util.Iterator;

import headfirst.designpatterns.compound.observer.Observable;
import headfirst.designpatterns.compound.observer.Observer;
import headfirst.designpatterns.compound.observer.Quackable;

public class Flock implements Quackable{
	ArrayList<Quackable> quackers = new ArrayList<Quackable>();
	Observable observable;
	
	public Flock() {
		 observable = new Observable(this);
	}
	
	public void add(Quackable quacker) {
		quackers.add(quacker);
	}
	
	public void quack() {
		Iterator<Quackable> iterator = quackers.iterator();
		while(iterator.hasNext()) {
			Quackable quacker = iterator.next();
			quacker.quack();
			notifyObservers();
		}
		
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
