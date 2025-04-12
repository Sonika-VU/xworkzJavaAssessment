package com.xworkz.ObjectMethodUsage.internal;

public class Mountain {
    private String name;
    private double height;
    private String location;

    public Mountain(String name, double height, String range) {
        System.out.println("String, double, String-arg const of Mountain");
        this.name = name;
        this.height = height;
        this.location = range;
    }

    @Override
    public String toString() {
        return "Mountain{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", range='" + location + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return -9876;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Mountain) {
                System.out.println("Ref instanceOf Mountain");
                Mountain mountain1 = this;
                Mountain  mountain2 = (Mountain) obj;
                if (mountain1.name == mountain2.name && mountain1.height == mountain2.height) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
