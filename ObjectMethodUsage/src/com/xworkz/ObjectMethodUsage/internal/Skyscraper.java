package com.xworkz.ObjectMethodUsage.internal;

public class Skyscraper {
    private String name;
    private int floors;
    private String city;

    public Skyscraper(String name, int floors, String city) {
        System.out.println("String, int, String-arg const of Skyscraper");
        this.name = name;
        this.floors = floors;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Skyscraper{" +
                "name='" + name + '\'' +
                ", floors=" + floors +
                ", city='" + city + '\'' +
                '}';
    }
}
