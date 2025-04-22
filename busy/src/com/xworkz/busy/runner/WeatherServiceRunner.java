package com.xworkz.busy.runner;

import com.xworkz.busy.external.WeatherApp;
import com.xworkz.busy.internal.implementor.OpenWeatherServiceImpl;
import com.xworkz.busy.internal.rules.WeatherService;

public class WeatherServiceRunner {
    public static void main(String[] args) {
        WeatherService weatherService = new OpenWeatherServiceImpl();
        WeatherApp weatherApp = new WeatherApp(weatherService);

        weatherApp.getReport();
    }
}
