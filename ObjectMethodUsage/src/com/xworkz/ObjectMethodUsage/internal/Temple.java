package com.xworkz.ObjectMethodUsage.internal;

public class Temple {
    private String name;
    private String location;
    private int age;

    public Temple(String name, String location, int age) {
        System.out.println("String, String, int-arg const of Temple");
        this.name = name;
        this.location = location;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Temple{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", age=" + age +
                '}';
    }
}
