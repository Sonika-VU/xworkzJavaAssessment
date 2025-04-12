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

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof ThemePark) {
                System.out.println("Ref instanceOf ThemePark");
                ThemePark themePark1 = this;
                ThemePark  themePark2 = (ThemePark) obj;
                if (themePark2.hasWaterPark == themePark1.hasWaterPark && themePark1.parkName == themePark1.parkName && themePark2.numberOfRides == themePark1.numberOfRides) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
