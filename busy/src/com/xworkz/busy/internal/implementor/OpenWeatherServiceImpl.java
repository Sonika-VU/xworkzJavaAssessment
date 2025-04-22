package com.xworkz.busy.internal.implementor;

import com.xworkz.busy.external.OperatingSystem;
import com.xworkz.busy.internal.rules.WeatherService;

public class OpenWeatherServiceImpl implements WeatherService {
    public OpenWeatherServiceImpl(){
        System.out.println("no-arg const of OpenWeatherServiceImpl");
    }
    @Override
    public void getForecast() {
        System.out.println("Running getForecast in OpenWeatherServiceImpl");
    }
}
