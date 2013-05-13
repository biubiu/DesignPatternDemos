package com.observer.weatherStationV2;

public class WeatherStation {
	public static void main(String[] args) {
		WeatherData weatherData  = new WeatherData();
		CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
		ForeConditionDisplay foreConditionDisplay = new ForeConditionDisplay(weatherData);
		
		weatherData.setMeasurement(80, 89, 98f);
		currentConditionDisplay.display();
		foreConditionDisplay.display();
	}
}
