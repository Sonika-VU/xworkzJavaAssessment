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

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Mug) {
                System.out.println("Ref instanceOf Mug");
                Mug mug1 = this;
                Mug  mug2 = (Mug) obj;
                if (mug1.capacityML == mug2.capacityML && mug1.hasHandle == mug2.hasHandle) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
