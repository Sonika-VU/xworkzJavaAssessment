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

    @Override
    public int hashCode() {
        return 4890;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof LunchBox) {
                System.out.println("Ref instanceOf LunchBox");
                LunchBox lunchBox1 = this;
                LunchBox  lunchBox2 = (LunchBox) obj;
                if (lunchBox1.capacityML == lunchBox2.capacityML && lunchBox1.isMicrowaveSafe == lunchBox2.isMicrowaveSafe) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}

