package headfirst.designpatterns.observerJavaUtils.execute;

import headfirst.designpatterns.observerJavaUtils.display.CurrentConditionsDisplay;
import headfirst.designpatterns.observerJavaUtils.display.ForecastDisplay;
import headfirst.designpatterns.observerJavaUtils.display.StatisticsDisplay;
import headfirst.designpatterns.observerJavaUtils.subject.WeatherData;

public class WeatherStation {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionsDisplay ccd = new CurrentConditionsDisplay(weatherData);
		ForecastDisplay fd = new ForecastDisplay(weatherData);
		StatisticsDisplay sd = new StatisticsDisplay(weatherData);
		weatherData.setMeasurements(80, 50, 30);
		weatherData.setMeasurements(60, 44, 70);
		weatherData.setMeasurements(70, 52, 50);
		weatherData.setMeasurements(30, 30, 11);

		weatherData.setMeasurements(80, 50, 30);
		weatherData.setMeasurements(60, 44, 70);
		weatherData.setMeasurements(70, 52, 50);
		weatherData.setMeasurements(30, 30, 11);
		
		
	}
}
