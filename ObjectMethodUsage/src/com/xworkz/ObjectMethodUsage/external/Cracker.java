package com.xworkz.ObjectMethodUsage.external;

public class Cracker {
    private final int cost=100;
    private String type;

    public Cracker(int cost, String type){
//        this.cost = cost;
        this.type = type;
    }

    public void display(){
        System.out.println("Cost : "+this.cost+", Type : "+this.type);
    }
}
