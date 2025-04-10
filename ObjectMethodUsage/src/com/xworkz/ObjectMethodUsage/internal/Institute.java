package com.xworkz.ObjectMethodUsage.internal;

public class Institute {
    private String name;
    private int noOfEmployees;
    private String location;

    public Institute(String name, String location, int noOfEmployees){
        System.out.println("String, String, int-arg const of Institute");
        this.name = name;
        this.location = location;
        this.noOfEmployees = noOfEmployees;
    }

    @Override
    public String toString() {
        return "Institute{" +
                "name='" + name + '\'' +
                ", noOfEmployees=" + noOfEmployees +
                ", location='" + location + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return 865;
    }
}
