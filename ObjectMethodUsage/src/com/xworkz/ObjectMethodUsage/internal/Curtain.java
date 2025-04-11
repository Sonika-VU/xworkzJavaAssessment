package com.xworkz.ObjectMethodUsage.internal;

public class Curtain {
    private String fabric;
    private String color;
    private boolean isBlackout;

    public Curtain(String fabric, String color, boolean isBlackout) {
        System.out.println("String, String, boolean-arg const of Curtain");
        this.fabric = fabric;
        this.color = color;
        this.isBlackout = isBlackout;
    }

    @Override
    public String toString() {
        return "Curtain{" +
                "fabric='" + fabric + '\'' +
                ", color='" + color + '\'' +
                ", isBlackout=" + isBlackout +
                '}';
    }

    @Override
    public int hashCode() {
        return 92380;
    }

    @Override
    public boolean equals(Object obj){
        if(obj != null){
            System.out.println("ref is not null");
            if(obj instanceof Curtain){
                System.out.println("Ref instanceOf Antique");
                Curtain curtain1 = this;
                Curtain curtain2 = (Curtain) obj;
                if(curtain1.fabric == curtain2.fabric ){
                    System.out.println("Both are same");
                    return  true;
                }
            }
        }
        return false;
    }
}
