package com.xworkz.ClassAsVariables;

public class Satellite {
    private SatelliteType satelliteType;
    private double cost;
    private double weight;
    private int loadCapacity;

    public SatelliteType getSatelliteType() {
        return satelliteType;
    }

    public void setSatelliteType(SatelliteType satelliteType) {
        this.satelliteType = satelliteType;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
}
