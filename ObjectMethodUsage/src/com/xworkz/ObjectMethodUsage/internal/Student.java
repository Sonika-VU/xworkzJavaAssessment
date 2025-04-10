package com.xworkz.ObjectMethodUsage.internal;

public class Student {
    private String name;
    private int rollNumber;
    private double percentage;

    public Student(String name, int rollNumber, double percentage) {
        System.out.println("String, int, double-arg const of Student");
        this.name = name;
        this.rollNumber = rollNumber;
        this.percentage = percentage;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNumber=" + rollNumber +
                ", percentage=" + percentage +
                '}';
    }

    @Override
    public int hashCode() {
        return 780;
    }
}
