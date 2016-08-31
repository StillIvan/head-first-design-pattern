package com.github.stillivan.pattern.observer.core;

/**
 * 观察者接口
 * Created by charming on 16/8/29.
 */
public interface Observer {
    void update(float temp, float humidity, float pressure);
}
