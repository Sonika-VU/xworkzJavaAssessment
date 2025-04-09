package com.xworkz.ObjectMethodUsage.internal;

public class FestivalEvent {
    private String name;
    private String location;
    private String date;

    public FestivalEvent(String name, String location, String date) {
        System.out.println("String, String, String-arg const of FestivalEvent");
        this.name = name;
        this.location = location;
        this.date = date;
    }

    @Override
    public String toString() {
        return "FestivalEvent{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
