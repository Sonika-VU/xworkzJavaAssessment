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

    @Override
    public int hashCode() {
        return 992;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Temple) {
                System.out.println("Ref instanceOf Temple");
                Temple temple1 = this;
                Temple  temple2 = (Temple) obj;
                if (temple2.age == temple1.age && temple2.name == temple1.name && temple2.location == temple1.location) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
