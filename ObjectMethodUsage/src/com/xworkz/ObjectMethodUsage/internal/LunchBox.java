package com.xworkz.ObjectMethodUsage.internal;

public class LunchBox {
    private String material;
    private int capacityML;
    private boolean isMicrowaveSafe;

    public LunchBox(String material, int capacityML, boolean isMicrowaveSafe) {
        System.out.println("String, int, boolean-arg const of LunchBox");
        this.material = material;
        this.capacityML = capacityML;
        this.isMicrowaveSafe = isMicrowaveSafe;
    }

    @Override
    public String toString() {
        return "LunchBox{" +
                "material='" + material + '\'' +
                ", capacityML=" + capacityML +
                ", isMicrowaveSafe=" + isMicrowaveSafe +
                '}';
    }
}

