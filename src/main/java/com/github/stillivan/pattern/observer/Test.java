package com.github.stillivan.pattern.observer;

import com.github.stillivan.pattern.observer.data.JWeatherData;
import com.github.stillivan.pattern.observer.data.WeatherData;
import com.github.stillivan.pattern.observer.display.CurrentConditionsDisplay;
import com.github.stillivan.pattern.observer.display.JCurrentConditionsDisplay;
import com.github.stillivan.pattern.observer.display.JForecastDisplay;
import com.github.stillivan.pattern.observer.display.JStaticsDisplay;
import com.github.stillivan.pattern.observer.display.StaticsDisplay;

/**
 * Created by charming on 16/8/30.
 */
public class Test {
    public static void weatherStation() {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StaticsDisplay staticsDisplay = new StaticsDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(77, 65, 30.4f);
        weatherData.setMeasurements(78, 65, 30.4f);
    }

    /**
     * Java 自带实现
     * @see java.util.Observable
     * @see java.util.Observer
     */
    public static void jWeatherStation() {
        JWeatherData jWeatherData = new JWeatherData();
        JCurrentConditionsDisplay jCurrentConditionsDisplay = new JCurrentConditionsDisplay(jWeatherData);
        JStaticsDisplay jStaticsDisplay = new JStaticsDisplay(jWeatherData);
        JForecastDisplay jForecastDisplay = new JForecastDisplay(jWeatherData);

        jWeatherData.setMeasurements(80, 65, 30.4f);
        jWeatherData.setMeasurements(82, 70, 29.2f);
        jWeatherData.setMeasurements(78, 90, 29.2f);
    }

    public static void main(String[] args) {
        //weatherStation();
        jWeatherStation();
    }
}
