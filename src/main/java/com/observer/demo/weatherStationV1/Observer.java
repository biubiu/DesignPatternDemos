package com.observer.demo.weatherStationV1;

/**
 * User: Shawn cao
 * Date: 15/1/26
 * Time: PM5:16
 */
public interface Observer {
    public void update(float temp, float humidity, float pressure);
}
