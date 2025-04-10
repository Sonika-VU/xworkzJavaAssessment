package com.xworkz.ObjectMethodUsage.internal;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

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
}
