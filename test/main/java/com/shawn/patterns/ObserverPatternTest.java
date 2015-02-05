package com.shawn.patterns;

import com.google.common.eventbus.EventBus;
import com.observer.demo.weatherStationV1.CurrentConditionDisplay;
import com.observer.demo.weatherStationV1.WeatherData;
import com.observer.demo.weatherStationWithEventBus.CurrentConditionDisplayBySubscribe;
import com.observer.demo.weatherStationWithEventBus.WeatherDataPOJO;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * User: Shawn cao
 * Date: 15/1/26
 * Time: PM5:12
 */
public class ObserverPatternTest {

    private float t1=10,t2=20,h1=75,h2=80,p1=30.4f,p2=44.2f;
    @Test
    public void testChanged(){
        WeatherData data = new WeatherData();

        CurrentConditionDisplay current = new CurrentConditionDisplay(data);
        data.setMeasurements(t1,h1,p1);

        String display = current.display();
        assertEquals("current ", display, "Current conditions:" + t1 + "F degrees and " + h1 + "% humidity"+p1);


        data.setMeasurements(t2,h2,p2);
        display = current.display();
        assertEquals("current ", display, "Current conditions:" + t2 + "F degrees and " + h2 + "% humidity"+p2);

    }

    @Test
    public void testChangedByEventBus(){

        CurrentConditionDisplayBySubscribe current = new CurrentConditionDisplayBySubscribe();
        EventBus eventBus = new EventBus();
        eventBus.register(current);
        eventBus.post(new WeatherDataPOJO(t1,h1,p1));
        String display = current.display();
        assertEquals("current ", display, "Current conditions:" + t1 + "F degrees and " + h1 + "% humidity"+p1);

        eventBus.post(new WeatherDataPOJO(t2,h2,p2));
        display = current.display();
        assertEquals("current ", display, "Current conditions:" + t2 + "F degrees and " + h2 + "% humidity"+p2);
    }
}
