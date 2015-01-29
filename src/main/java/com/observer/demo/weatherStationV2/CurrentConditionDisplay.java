package com.observer.demo.weatherStationV2;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionDisplay implements Observer,DisplayElement{

	Observable observable;
	private float temp;
	private float humidity;
	
	public CurrentConditionDisplay(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}
	@Override
	public void display() {
		System.out.println("temp: " + temp + " humidity: " + humidity);
	}

	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof WeatherData){
			WeatherData data = (WeatherData)o;
			this.temp = data.getTemp();
			this.humidity = data.getHumidity();
			display();
		}
	}

}
