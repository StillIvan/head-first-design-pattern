package com.github.stillivan.pattern.observer.data;

import java.util.Observable;

/**
 * 用 Java 自带的实现天气数据
 * @see java.util.Observable
 * Created by charming on 16/8/30.
 */
public class JWeatherData extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    public JWeatherData() {
    }

    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
