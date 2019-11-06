package headfirst.designpatterns.compound.adapter;

import headfirst.designpatterns.compound.model.Goose;
import headfirst.designpatterns.compound.observer.Observable;
import headfirst.designpatterns.compound.observer.Observer;
import headfirst.designpatterns.compound.observer.Quackable;

/**
 * Adapter pattern
 * @author sanghyukyoon
 *
 */
public class GooseAdapter implements Quackable{
	Goose goose;
	Observable observable;
	
	public GooseAdapter(Goose goose) {
		this.goose = goose;
		observable = new Observable(this);
	}
	
	public void quack() {
		goose.honk();
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
