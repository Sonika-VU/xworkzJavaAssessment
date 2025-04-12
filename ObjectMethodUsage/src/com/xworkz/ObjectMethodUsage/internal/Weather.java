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

    @Override
    public int hashCode() {
        return -80;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Weather) {
                System.out.println("Ref instanceOf Weather");
                Weather weather1 = this;
                Weather  weather2 = (Weather) obj;
                if (weather1.city == weather2.city && weather2.condition == weather1.condition && weather2.temperature == weather1.temperature) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
