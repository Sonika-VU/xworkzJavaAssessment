package com.xworkz.ObjectMethodUsage.internal;

public class Museum {
    private String name;
    private String city;
    private int numberOfArtifacts;

    public Museum(String name, String city, int numberOfArtifacts) {
        System.out.println("String, String, int-arg const of Museum");
        this.name = name;
        this.city = city;
        this.numberOfArtifacts = numberOfArtifacts;
    }

    @Override
    public String toString() {
        return "Museum{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", numberOfArtifacts=" + numberOfArtifacts +
                '}';
    }

    @Override
    public int hashCode() {
        return 100;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Museum) {
                System.out.println("Ref instanceOf Museum");
                Museum museum1 = this;
                Museum  museum2 = (Museum) obj;
                if (museum1.city == museum2.city && museum1.numberOfArtifacts == museum2.numberOfArtifacts) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
