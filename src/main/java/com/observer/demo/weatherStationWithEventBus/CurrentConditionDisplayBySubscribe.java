package com.observer.demo.weatherStationWithEventBus;


import com.google.common.eventbus.Subscribe;


public class CurrentConditionDisplayBySubscribe implements DisplayElement{

	private float temp;
	private float humidity;
	private float pressure;

	@Override
	public String display() {
		return "Current conditions:" + temp + "F degrees and " + humidity + "% humidity" + pressure;
	}

	@Subscribe
	public void onMessage(WeatherDataPOJO data) {
			System.out.println(data.toString());
			this.temp = data.getTemperature()  ;
			this.humidity = data.getHumidity();
			this.pressure = data.getPressure();
			display();
		}
	}


