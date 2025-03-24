package com.xworkz.AccessSpecifier.internal;

public class Train {
    public String name = "VandeBharat";
    String startingPoint = "Delhi";
    private double price = 1000;

    public void bookSeat(){
        System.out.println("Running bookSeat in Train");
        setPrice();
        System.out.println("Price : "+this.price);

    }

    void chooseDestination(){
        System.out.println("Running chooseDestination in Train");
    }

    private void setPrice(){
        System.out.println("Running setPrice in Train");
    }

}
