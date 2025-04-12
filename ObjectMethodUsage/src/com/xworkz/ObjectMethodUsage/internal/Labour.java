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

    @Override
    public int hashCode() {
        return 1000;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Labour) {
                System.out.println("Ref instanceOf Labour");
                Labour labour1 = this;
                Labour  labour2 = (Labour) obj;
                if (labour1.salary == labour2.salary && labour1.location == labour2.location) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
