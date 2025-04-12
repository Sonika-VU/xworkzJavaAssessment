package com.xworkz.ObjectMethodUsage.internal;

public class FitnessTracker {
    private String brand;
    private boolean waterResistant;
    private int batteryLifeHours;

    public FitnessTracker(String brand, boolean waterResistant, int batteryLifeHours) {
        System.out.println("String, boolean, int-arg const of FitnessTracker");
        this.brand = brand;
        this.waterResistant = waterResistant;
        this.batteryLifeHours = batteryLifeHours;
    }

    @Override
    public String toString() {
        return "FitnessTracker{" +
                "brand='" + brand + '\'' +
                ", waterResistant=" + waterResistant +
                ", batteryLifeHours=" + batteryLifeHours +
                '}';
    }

    @Override
    public int hashCode() {
        return 23901293;
    }

    @Override
    public boolean equals(Object obj){
        if(obj != null){
            System.out.println("ref is not null");
            if(obj instanceof FitnessTracker){
                System.out.println("Ref instanceOf FitnessTracker");
                FitnessTracker fitnessTracker1 = this;
                FitnessTracker fitnessTracker2 = (FitnessTracker) obj;
                if(fitnessTracker1.waterResistant == fitnessTracker2.waterResistant && fitnessTracker1.batteryLifeHours == fitnessTracker2.batteryLifeHours ){
                    System.out.println("Both are same");
                    return  true;
                }
            }
        }
        return false;
    }
}
