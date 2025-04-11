package com.xworkz.ObjectMethodUsage.internal;

public class Eagle {
    private String  color;
    private int noOfEyes;
    private boolean canFly;

    public Eagle(String color, int noOfEyes, boolean canFly){
        System.out.println("String, int, boolean-arg const of Eagle");
        this.color = color;
        this.noOfEyes = noOfEyes;
        this.canFly = canFly;
    }

    @Override
    public String toString() {
        return "Eagle{" +
                "color='" + color + '\'' +
                ", noOfEyes=" + noOfEyes +
                ", canFly=" + canFly +
                '}';
    }

    @Override
    public int hashCode() {
        return -10;
    }

    @Override
    public boolean equals(Object obj){
        if(obj != null){
            System.out.println("ref is not null");
            if(obj instanceof Eagle){
                System.out.println("Ref instanceOf Antique");
                Eagle eagle1 = this;
                Eagle eagle2 = (Eagle) obj;
                if(eagle1.color == eagle2.color ){
                    System.out.println("Both are same");
                    return  true;
                }
            }
        }
        return false;
    }
}
