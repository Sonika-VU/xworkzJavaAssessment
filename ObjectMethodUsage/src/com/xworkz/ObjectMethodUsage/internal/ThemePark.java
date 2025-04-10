package com.xworkz.ObjectMethodUsage.internal;

public class ThemePark {
    private String parkName;
    private int numberOfRides;
    private boolean hasWaterPark;

    public ThemePark(String parkName, int numberOfRides, boolean hasWaterPark) {
        System.out.println("String, int, boolean-arg const of ThemePark");
        this.parkName = parkName;
        this.numberOfRides = numberOfRides;
        this.hasWaterPark = hasWaterPark;
    }

    @Override
    public String toString() {
        return "ThemePark{" +
                "parkName='" + parkName + '\'' +
                ", numberOfRides=" + numberOfRides +
                ", hasWaterPark=" + hasWaterPark +
                '}';
    }

    @Override
    public int hashCode() {
        return -8709;
    }
}
