package com.github.stillivan.pattern.observer.core;

/**
 * Created by charming on 16/8/29.
 */
public interface Observer {
    void update(float temp, float humidity, float pressure);
}