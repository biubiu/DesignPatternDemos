package com.observer.weatherStationV1;

import java.util.ArrayList;

public class WeatherData implements Subject {
	private ArrayList<Observer> observers;
	private float temp;
	private float pressure;
	private float humidity;
	
	public WeatherData() {
		observers = new ArrayList<Observer>();
	}
	
	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if(i>0){
			observers.remove(i);
		}
		else {
			System.out.println("the observer does not exist");
		}
	}

	@Override
	public void nofityObservers() {
		for(int i=0; i<observers.size(); i++){
			Observer o = observers.get(i);
			o.update(temp, pressure, humidity);
		}
	}
	
	public void setMeasurement(float temp, float pressure, float humidity){
		this.temp = temp;
		this.pressure = pressure;
		this.humidity = humidity;
		this.nofityObservers();
	}

}
