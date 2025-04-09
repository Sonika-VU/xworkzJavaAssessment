package com.xworkz.ObjectMethodUsage.internal;

public class Employee {
    private String id;
    private String department;
    private double salary;

    public Employee(String id, String department, double salary) {
        System.out.println("String, String, double-arg const of Employee");
        this.id = id;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}
