package com.xworkz.ObjectMethodUsage.internal;

public class Planet {
    private String name;
    private int noOfNaturalSatellites;
    private int radius;

    public Planet(String name, int noOfNaturalSatellites, int radius){
        System.out.println("String, int, int-arg const of Planet");
        this.name = name;
        this.noOfNaturalSatellites = noOfNaturalSatellites;
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", noOfNaturalSatellites=" + noOfNaturalSatellites +
                ", radius=" + radius +
                '}';
    }

    @Override
    public int hashCode() {
        return -357833;
    }
}
