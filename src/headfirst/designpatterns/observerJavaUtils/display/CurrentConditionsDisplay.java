package headfirst.designpatterns.observerJavaUtils.display;

import java.util.Observable;
import java.util.Observer;
import headfirst.designpatterns.observerJavaUtils.subject.WeatherData;

public class CurrentConditionsDisplay implements Observer, DisplayElement{
	private Observable observable;
	private float temperature;
	private float humidity;

	public CurrentConditionsDisplay(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
		
	}
	

	@Override
	public void display() {
		System.out.println("Current Condition Display : " + temperature + "F degrees and " + humidity + "% humidity");
		
	}
	@Override
	public void update(Observable obs, Object arg) {
		if(obs instanceof WeatherData){
			WeatherData weatherData = (WeatherData) obs;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			display();
		}
	}
}
