package com.github.oycharming.pattern.observer.display;

import com.github.oycharming.pattern.observer.data.JWeatherData;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 * 展示平均、最大、最小温度,Java 自带的观察者实现
 * Created by charming on 16/8/29.
 */
public class JStaticsDisplay implements DisplayElement, Observer {
    private List<Float> temperatures;
    private Observable observable;

    public JStaticsDisplay(Observable observable) {
        temperatures = new ArrayList<>();
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof JWeatherData) {
            JWeatherData jWeatherData = (JWeatherData) o;
            temperatures.add(jWeatherData.getTemperature());
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("avg/max/min: " + avg() + "/" + max() + "/" + min());
    }

    private float avg() {
        float temperatureSum = 0;
        for (Float temperature : temperatures) {
            temperatureSum += temperature;
        }
        return temperatureSum / temperatures.size();
    }

    private float max() {
        float max = temperatures.get(0);
        for (Float temperature : temperatures) {
            max = temperature > max ? temperature : max;
        }
        return max;
    }

    private float min() {
        float min = temperatures.get(0);
        for (Float temperature : temperatures) {
            min = temperature < min ? temperature : min;
        }
        return min;
    }
}
