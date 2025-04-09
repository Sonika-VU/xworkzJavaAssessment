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
}
