package com.xworkz.ObjectMethodUsage.internal;

public class Zoo {

    private String name;
    private  String location;
    private int enteranceFee;

    public Zoo(String name, String location, int enteranceFee){
        System.out.println("String, String, int-arg const of Zoo");
        this.name = name;
        this.location  = location;
        this.enteranceFee = enteranceFee;
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", enteranceFee=" + enteranceFee +
                '}';
    }
    @Override
    public int hashCode() {
        return 75;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Zoo) {
                System.out.println("Ref instanceOf Zoo");
                Zoo zoo1 = this;
                Zoo  zoo2 = (Zoo) obj;
                if (zoo2.enteranceFee == zoo1.enteranceFee && zoo2.name == zoo1.name && zoo2.location ==zoo1.location) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
