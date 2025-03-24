package com.xworkz.AccessSpecifier.internal;

public class Board {
    public String color = "Black";
    int price = 50000;
    private boolean isSmartBoard = true;

    public void write(){
        System.out.println("Running write in Board");
        System.out.println("Is it a SmartBoard : "+isSmartBoard);
        connectInternet();
    }

    void watchMovie(){
        System.out.println("Running watchMovie in Board");
    }

    private void connectInternet(){
        System.out.println("Running connectInternet in Board");
    }

}
