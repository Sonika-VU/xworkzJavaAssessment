package com.xworkz.ObjectMethodUsage.internal;

public class Skyscraper {
    private String name;
    private int floors;
    private String city;

    public Skyscraper(String name, int floors, String city) {
        System.out.println("String, int, String-arg const of Skyscraper");
        this.name = name;
        this.floors = floors;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Skyscraper{" +
                "name='" + name + '\'' +
                ", floors=" + floors +
                ", city='" + city + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return 9807;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Skyscraper) {
                System.out.println("Ref instanceOf Skyscraper");
                Skyscraper skyscraper1 = this;
                Skyscraper  skyscraper2 = (Skyscraper) obj;
                if ( skyscraper2.city == skyscraper1.city && skyscraper2.name == skyscraper1.name && skyscraper2.floors == skyscraper1.floors) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
