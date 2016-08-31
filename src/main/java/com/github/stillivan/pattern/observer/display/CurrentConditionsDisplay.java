package com.github.stillivan.pattern.observer.display;

import com.github.stillivan.pattern.observer.core.Observer;
import com.github.stillivan.pattern.observer.core.Subject;

/**
 * 纯展示现在的数据
 * Created by charming on 16/8/29.
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("current conditions: " + temperature + "F degrees and " + humidity + "% humidity.");
    }
}
