package com.observer.demo.weatherStationV1;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * User: Shawn cao
 * Date: 15/1/26
 * Time: PM5:27
 */
public class WeatherData implements Subject {

    private List observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){
        observers = Lists.newArrayList();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if( i> 0)
            observers.remove(i);
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer)observers.get(i);
            observer.update(temperature,humidity,pressure);
        }
    }

    public void measurementsChanged(){
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
