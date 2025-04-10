package com.xworkz.ObjectMethodUsage.internal;

public class Zoo {

    private String name;
    private  String location;
    private int enteranceFee;

    public Zoo(String name, String location, int enteranceFee){
        System.out.println("String, String, int-arg const of Zoo");
        this.name = name;
        this.location  = location;
        this.enteranceFee = enteranceFee;
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", enteranceFee=" + enteranceFee +
                '}';
    }
    @Override
    public int hashCode() {
        return 75;
    }
}
