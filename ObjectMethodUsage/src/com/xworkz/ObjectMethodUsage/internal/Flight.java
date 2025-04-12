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

    @Override
    public int hashCode() {
        return 23432;
    }

    @Override
    public boolean equals(Object obj){
        if(obj != null){
            System.out.println("ref is not null");
            if(obj instanceof Flight){
                System.out.println("Ref instanceOf Flight");
                Flight flight1 = this;
                Flight flight2 = (Flight) obj;
                if(flight1.airline == flight2.airline && flight1.isInternational == flight2.isInternational ){
                    System.out.println("Both are same");
                    return  true;
                }
            }
        }
        return false;
    }
}
