package com.github.stillivan.pattern.observer.display;

import com.github.stillivan.pattern.observer.core.Observer;
import com.github.stillivan.pattern.observer.core.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * 统计数据展示平均、最大、最小温度
 * Created by charming on 16/8/29.
 */
public class StaticsDisplay implements DisplayElement, Observer {
    private List<Float> temperatures;
    private Subject weatherData;

    public StaticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        this.temperatures = new ArrayList<>();
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        temperatures.add(temp);
        display();
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
