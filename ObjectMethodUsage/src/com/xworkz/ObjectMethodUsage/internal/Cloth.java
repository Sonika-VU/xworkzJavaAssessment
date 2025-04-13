package com.xworkz.ObjectMethodUsage.internal;

public class Cloth {
    private  String material;
    private String color;
    private int length;

    public Cloth(String material, String color, int length){
        System.out.println("String, String, int arg const of Cloth");
        this.material = material;
        this.color = color;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Cloth{" +
                "material='" + material + '\'' +
                ", color='" + color + '\'' +
                ", length=" + length +
                '}';
    }

    @Override
    public int hashCode() {
        return 2321;
    }
    @Override
    public boolean equals(Object obj){
        if(obj != null){
            System.out.println("ref is not null");
            if(obj instanceof App){
                System.out.println("Ref instanceOf Cloth");
                Cloth cloth1 = this;
                Cloth cloth2 = (Cloth) obj;
                if(cloth1.material == cloth2.material ){
                    System.out.println("Both are same");
                    return  true;
                }
            }
        }
        return false;
    }

}
