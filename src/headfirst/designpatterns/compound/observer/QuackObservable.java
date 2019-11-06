package headfirst.designpatterns.compound.observer;


public interface QuackObservable {
	public void registerObserver(Observer observer);
	public void notifyObservers();
}
