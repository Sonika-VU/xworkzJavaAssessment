package com.xworkz.association.internal;

public class Len {
    private String type;
    private int resolution;

    public void focus(){
        System.out.println("Running focus in Len");
    }

    public Len(){
        System.out.println("no-arg const of Len");
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setResolution(int resolution) {
        this.resolution = resolution;
    }

    public String getType() {
        return type;
    }

    public int getResolution() {
        return resolution;
    }
}
