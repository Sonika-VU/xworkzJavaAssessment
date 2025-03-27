package com.xworkz.association.internal;

public class Quality {
    private String type;

    public Quality(){
        System.out.println("no-arg const of Quality");
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
