package com.xworkz.ObjectMethodUsage.internal;

public class Antique {
    private String name;
    private int ageInYears;
    private String originCountry;

    public Antique(String name, int ageInYears, String originCountry) {
        System.out.println("String, int, String-arg const of Antique");
        this.name = name;
        this.ageInYears = ageInYears;
        this.originCountry = originCountry;
    }

    @Override
    public String toString() {
        return "Antique{" +
                "name='" + name + '\'' +
                ", ageInYears=" + ageInYears +
                ", originCountry='" + originCountry + '\'' +
                '}';
    }
}
