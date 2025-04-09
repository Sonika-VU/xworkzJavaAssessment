package com.xworkz.ObjectMethodUsage.internal;

public class Capsule {
    private String name;
    private String forDisease;
    private int noOfTimes;

    public Capsule(String name, String forDisease, int noOfTimes){
        System.out.println("String, String, int-const of Capsule");
        this.name = name;
        this.forDisease = forDisease;
        this.noOfTimes = noOfTimes;
    }

    @Override
    public String toString() {
        return "Capsule{" +
                "name='" + name + '\'' +
                ", forDisease='" + forDisease + '\'' +
                ", noOfTimes=" + noOfTimes +
                '}';
    }
}
