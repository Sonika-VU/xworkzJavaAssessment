package com.xworkz.ObjectMethodUsage.internal;

public class Chocolate {
    private String name;
    private boolean hasAlmond;
    private int cost;

    public Chocolate(String name, boolean hasAlmond, int cost){
        System.out.println("String, boolean, int-arg const of Chocolate");
        this.name = name;
        this.hasAlmond = hasAlmond;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Chocolate{" +
                "name='" + name + '\'' +
                ", hasAlmond=" + hasAlmond +
                ", cost=" + cost +
                '}';
    }

    @Override
    public int hashCode() {
        return -121;
    }

    @Override
    public boolean equals(Object obj){
        if(obj != null){
            System.out.println("ref is not null");
            if(obj instanceof Chocolate){
                System.out.println("Ref instanceOf Antique");
                Chocolate chocolate1 = this;
                Chocolate chocolate2 = (Chocolate) obj;
                if(chocolate1.name == chocolate2.name ){
                    System.out.println("Both are same");
                    return  true;
                }
            }
        }
        return false;
    }
}
