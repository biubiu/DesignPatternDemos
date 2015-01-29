package com.observer.demo.weatherStationV1;

/**
 * User: Shawn cao
 * Date: 15/1/26
 * Time: PM5:17
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
