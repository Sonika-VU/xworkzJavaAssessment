package com.xworkz.ObjectMethodUsage.internal;


public class Door {
    private  String material;
    private int height;
    private int width;

    public Door(String material, int height, int width){
        System.out.println("String, int, int-arg const of Door");
        this.material = material;
        this.height = height;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Door{" +
                "material='" + material + '\'' +
                ", height=" + height +
                ", width=" + width +
                '}';
    }

    @Override
    public int hashCode() {
        return 2067;
    }

    @Override
    public boolean equals(Object obj){
        if(obj != null){
            System.out.println("ref is not null");
            if(obj instanceof Door){
                System.out.println("Ref instanceOf Door");
                Door door1 = this;
                Door door2 = (Door) obj;
                if(door1.material == door2.material ){
                    System.out.println("Both are same");
                    return  true;
                }
            }
        }
        return false;
    }
}
