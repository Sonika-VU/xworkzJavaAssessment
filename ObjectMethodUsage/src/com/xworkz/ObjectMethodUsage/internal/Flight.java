package com.xworkz.ObjectMethodUsage.internal;

public class Flight {
    private String airline;
    private int flightNumber;
    private boolean isInternational;

    public Flight(String airline, int flightNumber, boolean isInternational) {
        System.out.println("String, int, boolean-arg const of Flight");
        this.airline = airline;
        this.flightNumber = flightNumber;
        this.isInternational = isInternational;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "airline='" + airline + '\'' +
                ", flightNumber=" + flightNumber +
                ", isInternational=" + isInternational +
                '}';
    }
}
