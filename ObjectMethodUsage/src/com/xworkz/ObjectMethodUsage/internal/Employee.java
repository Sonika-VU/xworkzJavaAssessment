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

    @Override
    public int hashCode() {
        return 100000;
    }

    @Override
    public boolean equals(Object obj){
        if(obj != null){
            System.out.println("ref is not null");
            if(obj instanceof Employee){
                System.out.println("Ref instanceOf Antique");
                Employee employee1 = this;
                Employee employee2 = (Employee) obj;
                if(employee1.department == employee2.department ){
                    System.out.println("Both are same");
                    return  true;
                }
            }
        }
        return false;
    }
}
