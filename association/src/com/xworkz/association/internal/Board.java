package com.xworkz.association.internal;

public class Board {
    private int height;
    private  int width;
    private Capacitor capacitor;

    public Board(Capacitor capacitor){
        System.out.println("1-arg const of Capacitor");
        this.capacitor = capacitor;
    }

    public void display(){
        System.out.println("Running display in Board");
        if(capacitor != null){
            capacitor.setVolts(240);
            System.out.println(" Capacitor : ");
            System.out.println("\tVolts : "+capacitor.getVolts());
            capacitor.storeEnergy();
        }
    }

}
