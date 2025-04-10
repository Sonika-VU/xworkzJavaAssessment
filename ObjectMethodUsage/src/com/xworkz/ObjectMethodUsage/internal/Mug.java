package com.xworkz.ObjectMethodUsage.internal;

public class Mug {
    private String material;
    private int capacityML;
    private boolean hasHandle;

    public Mug(String material, int capacityML, boolean hasHandle) {
        System.out.println("String, int, boolean-arg const of Mug");
        this.material = material;
        this.capacityML = capacityML;
        this.hasHandle = hasHandle;
    }

    @Override
    public String toString() {
        return "Mug{" +
                "material='" + material + '\'' +
                ", capacityML=" + capacityML +
                ", hasHandle=" + hasHandle +
                '}';
    }

    @Override
    public int hashCode() {
        return 63;
    }
}
