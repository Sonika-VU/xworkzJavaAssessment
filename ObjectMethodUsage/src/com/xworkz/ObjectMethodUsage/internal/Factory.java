package com.xworkz.ObjectMethodUsage.internal;

public class Factory {
    private String name;
    private String type;
    private String location;

    public Factory(String name, String type, String location){
        System.out.println("String, String, String -arg const of Factory");
        this.name = name;
        this.type = type;
        this.location = location;
    }


    @Override
    public String toString() {
        return "Factory{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return 2934820;
    }
}

