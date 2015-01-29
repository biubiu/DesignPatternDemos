package com.observer.demo.weatherStationWithEventBus;

import com.google.common.base.Objects;

/**
 * User: Shawn cao
 * Date: 15/1/26
 * Time: PM10:30
 */
public class WeatherDataPOJO {

    private float temperature;
    private float pressure;
    private float humidity;

    public WeatherDataPOJO(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getPressure() {
        return pressure;
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this)
                .add("temperature", temperature)
                .add("pressure", pressure)
                .add("humidity", humidity)
                .toString();
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

}
