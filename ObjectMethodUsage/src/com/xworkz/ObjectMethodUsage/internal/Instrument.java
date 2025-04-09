package com.xworkz.ObjectMethodUsage.internal;

public class Instrument {
    private String name;
    private String type;
    private boolean electric;

    public Instrument(String name, String type, boolean electric) {
        System.out.println("String, String, boolean-arg const of Instrument");
        this.name = name;
        this.type = type;
        this.electric = electric;
    }

    @Override
    public String toString() {
        return "Instrument{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", electric=" + electric +
                '}';
    }
}
