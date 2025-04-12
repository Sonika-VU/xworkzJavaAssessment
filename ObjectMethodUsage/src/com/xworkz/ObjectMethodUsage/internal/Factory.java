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

    @Override
    public boolean equals(Object obj){
        if(obj != null){
            System.out.println("ref is not null");
            if(obj instanceof Factory){
                System.out.println("Ref instanceOf Factory");
                Factory factory1 = this;
                Factory factory2 = (Factory) obj;
                if(factory1.type == factory2.type && factory1.location == factory2.location ){
                    System.out.println("Both are same");
                    return  true;
                }
            }
        }
        return false;
    }
}

