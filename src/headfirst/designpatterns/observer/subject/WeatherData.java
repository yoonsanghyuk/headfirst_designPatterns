package headfirst.designpatterns.observer.subject;

import java.util.ArrayList;
import java.util.List;

import headfirst.designpatterns.observer.display.Observer;

public class WeatherData implements Subject{
	private List<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	
	
	public WeatherData() {
		this.observers = new ArrayList<Observer>();
	}
	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}
	@Override
	public void removeObserver(Observer o) {
		observers.remove(observers.indexOf(o));
	}
	@Override
	public void notifyObservers() {
		observers.forEach(o -> o.update(temperature, humidity, pressure));
		
	}
	
	float getTemperature() {
		return temperature;
	}
	float getHumidity() {
		return humidity;
	}
	float getPressure() {
		return pressure;
	}
	
	void measurementsChanged(){
		notifyObservers();
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		
		measurementsChanged();
	}
	
}
