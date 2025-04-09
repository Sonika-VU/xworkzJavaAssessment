package com.xworkz.ObjectMethodUsage.internal;

public class Labour {
    private String name;
    private double salary;
    private String location;

    public Labour(String name, String location, double salary){
        System.out.println("String, String, double const of Labour");
        this.name = name;
        this.location = location;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Labour{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", location='" + location + '\'' +
                '}';
    }
}
