package com.xworkz.ObjectMethodUsage.internal;

public class Capsule {
    private String name;
    private String forDisease;
    private int noOfTimes;

    public Capsule(String name, String forDisease, int noOfTimes){
        System.out.println("String, String, int-const of Capsule");
        this.name = name;
        this.forDisease = forDisease;
        this.noOfTimes = noOfTimes;
    }

    @Override
    public String toString() {
        return "Capsule{" +
                "name='" + name + '\'' +
                ", forDisease='" + forDisease + '\'' +
                ", noOfTimes=" + noOfTimes +
                '}';
    }

    @Override
    public int hashCode() {
        return -342;
    }

    @Override
    public boolean equals(Object obj){
        if(obj != null){
            System.out.println("ref is not null");
            if(obj instanceof Capsule){
                System.out.println("Ref instanceOf Antique");
                Capsule capsule1 = this;
                Capsule capsule2 = (Capsule) obj;
                if(capsule1.forDisease == capsule2.forDisease ){
                    System.out.println("Both are same");
                    return  true;
                }
            }
        }
        return false;
    }
}
