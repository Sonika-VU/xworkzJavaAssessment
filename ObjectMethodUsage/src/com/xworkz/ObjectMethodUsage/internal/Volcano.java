package com.xworkz.ObjectMethodUsage.internal;

public class Volcano {
    private String name;
    private String location;
    private boolean isActive;

    public Volcano(String name, String location, boolean isActive) {
        System.out.println("String, String, boolean-arg const of Volcano");
        this.name = name;
        this.location = location;
        this.isActive = isActive;
    }

    @Override
    public String toString() {
        return "Volcano{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", isActive=" + isActive +
                '}';
    }

    @Override
    public int hashCode() {
        return 1000;
    }
}
