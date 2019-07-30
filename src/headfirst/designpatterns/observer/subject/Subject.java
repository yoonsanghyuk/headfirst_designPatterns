package headfirst.designpatterns.observer.subject;

import headfirst.designpatterns.observer.display.Observer;

public interface Subject {
	void registerObserver(Observer o);
	void removeObserver(Observer o);
	void notifyObservers();
	
	
}
