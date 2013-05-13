package com.observer.weatherStationV1;

public class WeatherStation {
	public static void main(String[] args) {
		WeatherData data = new WeatherData();
		
		
		CurrentConditionDisplay conditionDisplay = new CurrentConditionDisplay(data);
		data.setMeasurement(80, 65, 30.4f);
		conditionDisplay.display();
	}
}
