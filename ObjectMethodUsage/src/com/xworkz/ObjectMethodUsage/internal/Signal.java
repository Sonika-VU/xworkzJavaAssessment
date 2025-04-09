package com.xworkz.ObjectMethodUsage.internal;

public class Signal {
    private String location;
    private int duration;
    private boolean isWorking;

    public Signal(String location, int duration, boolean isWorking) {
        System.out.println("String, int, boolean-arg const of Signal");
        this.location = location;
        this.duration = duration;
        this.isWorking = isWorking;
    }

    @Override
    public String toString() {
        return "Signal{" +
                "location='" + location + '\'' +
                ", duration=" + duration +
                ", isWorking=" + isWorking +
                '}';
    }
}
