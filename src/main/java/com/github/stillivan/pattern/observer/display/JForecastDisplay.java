package com.github.stillivan.pattern.observer.display;

import com.github.stillivan.pattern.observer.data.JWeatherData;

import java.util.Observable;
import java.util.Observer;

/**
 * 展示预测的数据,Java 自带的观察者接口
 * Created by charming on 16/8/30.
 */
public class JForecastDisplay implements Observer, DisplayElement {
    private float currentPressure = 29.92f;
    private float lastPressure;
    private Observable observable;

    public JForecastDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        if (currentPressure > lastPressure) {
            System.out.println("Forecast: improving weather on the way.");
        } else if (currentPressure == lastPressure) {
            System.out.println("Forecast: More of the same.");
        } else {
            System.out.println("Forecast: Watch out for cooler, rainy weather.");
        }
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof JWeatherData) {
            JWeatherData jWeatherData = (JWeatherData) o;
            this.lastPressure = this.currentPressure;
            this.currentPressure = jWeatherData.getPressure();
            display();
        }
    }
}
