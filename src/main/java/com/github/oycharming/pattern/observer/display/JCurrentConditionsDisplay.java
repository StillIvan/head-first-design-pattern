package com.github.oycharming.pattern.observer.display;

import com.github.oycharming.pattern.observer.data.JWeatherData;

import java.util.Observable;
import java.util.Observer;

/**
 * 展示现在的数据,实现 Java 自带的观察者接口
 * Created by charming on 16/8/30.
 */
public class JCurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Observable observable;

    public JCurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("current conditions: " + temperature + "F degrees and " + humidity + "% humidity.");
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof JWeatherData) {
            JWeatherData jWeatherData = (JWeatherData) o;
            this.temperature = jWeatherData.getTemperature();
            this.humidity = jWeatherData.getHumidity();
            display();
        }
    }
}
