package com.xworkz.ObjectMethodUsage.internal;

public class Speaker {
    private String brand;
    private int wattage;
    private boolean isBluetooth;

    public Speaker(String brand, int wattage, boolean isBluetooth) {
        System.out.println("String, int, boolean-arg const of Speaker");
        this.brand = brand;
        this.wattage = wattage;
        this.isBluetooth = isBluetooth;
    }

    @Override
    public String toString() {
        return "Speaker{" +
                "brand='" + brand + '\'' +
                ", wattage=" + wattage +
                ", isBluetooth=" + isBluetooth +
                '}';
    }

    @Override
    public int hashCode() {
        return 10000;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Speaker) {
                System.out.println("Ref instanceOf Speaker");
                Speaker speaker1 = this;
                Speaker  speaker2 = (Speaker) obj;
                if (speaker2.isBluetooth == speaker1.isBluetooth && speaker2.brand == speaker1.brand && speaker2.wattage == speaker1.wattage) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
