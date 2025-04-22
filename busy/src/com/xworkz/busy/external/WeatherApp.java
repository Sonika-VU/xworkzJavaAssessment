package com.xworkz.busy.external;

import com.xworkz.busy.internal.rules.WeatherService;

public class WeatherApp {

    WeatherService weatherService;

    public WeatherApp(WeatherService weatherService){
        this.weatherService = weatherService;
        System.out.println("weatherService-arg const of WeatherApp");
    }

    public void getReport(){
        System.out.println("Running getReport in WeatherApp");
        if(this.weatherService != null ){
            weatherService.getForecast();
        }
    }
}
