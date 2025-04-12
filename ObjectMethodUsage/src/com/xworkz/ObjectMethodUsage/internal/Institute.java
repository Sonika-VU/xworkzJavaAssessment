package com.xworkz.ObjectMethodUsage.internal;

public class Institute {
    private String name;
    private int noOfEmployees;
    private String location;

    public Institute(String name, String location, int noOfEmployees){
        System.out.println("String, String, int-arg const of Institute");
        this.name = name;
        this.location = location;
        this.noOfEmployees = noOfEmployees;
    }

    @Override
    public String toString() {
        return "Institute{" +
                "name='" + name + '\'' +
                ", noOfEmployees=" + noOfEmployees +
                ", location='" + location + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return 865;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Institute) {
                System.out.println("Ref instanceOf Institute");
                Institute institute1 = this;
                Institute  institute2 = (Institute) obj;
                if (institute1.name == institute2.name && institute1.location == institute2.location) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }

}
