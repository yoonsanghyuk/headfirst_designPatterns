package headfirst.designpatterns.observer.execute;

import headfirst.designpatterns.observer.display.CurrentConditionsDisplay;
import headfirst.designpatterns.observer.subject.WeatherData;

public class WeatherStation {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionsDisplay ccd = new CurrentConditionsDisplay(weatherData);
		weatherData.setMeasurements(80, 50, 30);
		weatherData.setMeasurements(60, 44, 70);
		weatherData.setMeasurements(70, 52, 50);
		weatherData.setMeasurements(30, 30, 11);
		
		
	}
}
