package com.xworkz.association.internal;

public class Lamp {

    private String color;
    private int cost;
    private Warranty warranty;


    public void glow(){
        System.out.println("running glow in Lamp");
        if(warranty != null){
            System.out.println("  Warranty : ");
            warranty.setStartDate("12-01-2025");
            warranty.setEndDate("10-01-2030");

            System.out.println("\tWarranty start date : "+warranty.getStartDate());
            System.out.println("\tWarranty end date : "+warranty.getEndDate());
        }
    }

    public Lamp(Warranty warranty){
        System.out.println("1-arg const of Lamp");
        this.warranty = warranty;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getColor() {
        return color;
    }

    public int getCost() {
        return cost;
    }

    public void setWarranty(Warranty warranty) {
        this.warranty = warranty;
    }

    public Warranty getWarranty() {
        return warranty;
    }
}
