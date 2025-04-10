package com.xworkz.ObjectMethodUsage.internal;

public class Currency {
    private String country;
    private String name;
    private double exchangeRate;

    public Currency(String country, String name, double exchangeRate) {
        System.out.println("String, String, double-arg const of Currency");
        this.country = country;
        this.name = name;
        this.exchangeRate = exchangeRate;
    }

    @Override
    public String toString() {
        return "Currency{" +
                "country='" + country + '\'' +
                ", name='" + name + '\'' +
                ", exchangeRate=" + exchangeRate +
                '}';
    }

    @Override
    public int hashCode() {
        return 3949;
    }
}
