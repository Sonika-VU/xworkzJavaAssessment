package com.xworkz.ObjectMethodUsage.internal;

public class Weather {
    private String city;
    private double temperature;
    private String condition;

    public Weather(String city, double temperature, String condition) {
        System.out.println("String, double, String-arg const of Weather");
        this.city = city;
        this.temperature = temperature;
        this.condition = condition;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "city='" + city + '\'' +
                ", temperature=" + temperature +
                ", condition='" + condition + '\'' +
                '}';
    }
}
