package com.xworkz.abstractKeyword.external;

public abstract class Building {

    private String name;
    private String location;
    private int cost;

    public Building(String name, String location, int cost){
        this.name = name;
        this.location = location;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Building{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", cost=" + cost +
                '}';
    }
}
