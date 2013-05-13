package com.observer.weatherStationV1;

public class CurrentConditionDisplay implements Observer, DisplayElement {
	private float temp;
	private float humidity;
	private Subject weatherData;

	public CurrentConditionDisplay(Subject subject) {
		this.weatherData = subject;
		weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		System.out.println(" current conditon " + temp + " F degree and humidity: " + humidity + " % humidity");
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temp = temp;
		this.humidity = humidity;
	}

}
