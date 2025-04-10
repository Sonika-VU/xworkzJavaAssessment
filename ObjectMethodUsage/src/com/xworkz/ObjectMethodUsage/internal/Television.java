package com.xworkz.ObjectMethodUsage.internal;

public class Television {
    private String company;
    private int inch;
    private double cost;

    public Television(String company, int inch, double cost){
        System.out.println("String, int, double-arg const of Television");
        this.company = company;
        this.inch = inch;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Television{" +
                "company='" + company + '\'' +
                ", inch=" + inch +
                ", cost=" + cost +
                '}';
    }

    @Override
    public int hashCode() {
        return 30000;
    }
}
