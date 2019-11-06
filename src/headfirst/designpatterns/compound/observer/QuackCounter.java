package headfirst.designpatterns.compound.observer;

/**
 * Decorator pattern
 * @author sanghyukyoon
 *
 */
public class QuackCounter implements Quackable{
	Quackable duck;
	static int numberOfQuacks;
	Observable observable;
	
	public QuackCounter(Quackable duck) {
		this.duck = duck;
		observable = new Observable(this);
	}

	public void quack() {
		duck.quack();
		numberOfQuacks++;
		notifyObservers();
	}
	
	public static int getQuacks() {
		return numberOfQuacks;
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
