package com.xworkz.association.internal;

public class Wire {
    private int length;
    private int cost;
    private Quality quality;

    public Wire(Quality quality){
        System.out.println("1-arg Wire const");
        this.quality = quality;
    }

    public void transferData(){
        System.out.println("Running transferData in Wire");
        if(quality != null){
            quality.setType("Medium");
            System.out.println("   Quality: ");

            System.out.println("\tQuality type : "+quality.getType());
        }
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getLength() {
        return length;
    }

    public int getCost() {
        return cost;
    }

}
