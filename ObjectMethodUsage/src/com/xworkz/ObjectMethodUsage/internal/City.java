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

    @Override
    public boolean equals(Object obj){
        if(obj != null){
            System.out.println("ref is not null");
            if(obj instanceof City){
                System.out.println("Ref instanceOf Antique");
                City city1 = this;
                City city2 = (City) obj;
                if(city1.name == city2.name ){
                    System.out.println("Both are same");
                    return  true;
                }
            }
        }
        return false;
    }
}
