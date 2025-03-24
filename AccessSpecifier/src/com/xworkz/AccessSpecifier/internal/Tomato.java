package com.xworkz.AccessSpecifier.internal;

public class Tomato {

    public boolean isRipen = true;
    int price = 20;
    private String grownBy = "Kishan";

    public void waterPlants(){
        System.out.println("Running waterPlants in Tomato");
        System.out.println("Grown by : "+this.grownBy);
        this.maintain();
    }

    void setArea(){
        System.out.println("Running setArea in Tomato");
    }

    private void maintain(){
        System.out.println("Running maintain in Tomato");
    }

}
