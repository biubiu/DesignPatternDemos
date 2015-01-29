package com.observer.demo.weatherStationV2;

import java.util.Observable;
import java.util.Observer;

public class ForeConditionDisplay implements Observer,DisplayElement{

	Observable observable;
	private float temp;
	private float humidity;
	private float pressure;

	public ForeConditionDisplay(Observable observable) {
		this.observable = observable;
	}
	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof WeatherData){
			this.temp = ((WeatherData) o).getTemp();
			this.humidity=((WeatherData) o).getHumidity();
			this.pressure = ((WeatherData) o).getPressure();
		}
	}

	@Override
	public void display() {
		System.out.println(" forcast the weather: " + "temp-->" + temp + " humidity--> " + humidity
							+ " pressure-->" + pressure);	
	}

}
