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

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Planet) {
                System.out.println("Ref instanceOf Planet");
                Planet planet1 = this;
                Planet  planet2 = (Planet) obj;
                if (planet1.name == planet2.name && planet1.noOfNaturalSatellites == planet2.noOfNaturalSatellites && planet1.radius == planet2.radius) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
