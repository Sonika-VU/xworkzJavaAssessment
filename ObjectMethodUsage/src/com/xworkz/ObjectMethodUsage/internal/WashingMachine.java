package com.xworkz.ObjectMethodUsage.internal;

public class WashingMachine {
    private String brand;
    private int loadCapacityKG;
    private boolean isFrontLoad;

    public WashingMachine(String brand, int loadCapacityKG, boolean isFrontLoad) {
        System.out.println("String, int, boolean-arg const of WashingMachine");
        this.brand = brand;
        this.loadCapacityKG = loadCapacityKG;
        this.isFrontLoad = isFrontLoad;
    }

    @Override
    public String toString() {
        return "WashingMachine{" +
                "brand='" + brand + '\'' +
                ", loadCapacityKG=" + loadCapacityKG +
                ", isFrontLoad=" + isFrontLoad +
                '}';
    }

    @Override
    public int hashCode() {
        return 2355;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof WashingMachine) {
                System.out.println("Ref instanceOf WashingMackine");
                WashingMachine washingMachine1 = this;
                WashingMachine  washingMachine2 = (WashingMachine) obj;
                if (washingMachine2.isFrontLoad == washingMachine1.isFrontLoad  && washingMachine2.loadCapacityKG == washingMachine1.loadCapacityKG &&washingMachine2.brand == washingMachine1.brand) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}

