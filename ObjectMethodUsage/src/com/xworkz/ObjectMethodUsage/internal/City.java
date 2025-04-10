package com.xworkz.ObjectMethodUsage.internal;

public class City {
    private String name;
    private String state;
    private long population;

    public City(String name, String state, long population) {
        System.out.println("String, String, long-arg const of City");
        this.name = name;
        this.state = state;
        this.population = population;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", state='" + state + '\'' +
                ", population=" + population +
                '}';
    }

    @Override
    public int hashCode() {
        return -56;
    }
}
