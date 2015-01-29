package com.observer.demo.weatherStationV2;

import java.util.Observable;
import java.util.Observer;

public class WeatherData extends Observable {
	private float temp;
	private float humidity;
	private float pressure;
	
	public void measurementChanged(){
		setChanged();
		notifyObservers();
	}
	
	public void setMeasurement(float temp, float humidity, float pressure){
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementChanged();
	}

	public float getTemp() {
		return temp;
	}

	public void setTemp(float temp) {
		this.temp = temp;
	}

	public float getHumidity() {
		return humidity;
	}

	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}

	public float getPressure() {
		return pressure;
	}

	public void setPressure(float pressure) {
		this.pressure = pressure;
	}
	
	
}
