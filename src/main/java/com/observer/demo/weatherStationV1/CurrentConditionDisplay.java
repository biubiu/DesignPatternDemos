package com.observer.demo.weatherStationV1;

/**
 * User: Shawn cao
 * Date: 15/1/26
 * Time: PM5:15
 */
public class CurrentConditionDisplay implements Observer,DisplayElement {

    private float temperature;
    private float humidity;
    private  float pressure;
    private Subject weatherData;

    public CurrentConditionDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public String display() {
        return "Current conditions:" + temperature + "F degrees and " + humidity + "% humidity" + pressure;
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
