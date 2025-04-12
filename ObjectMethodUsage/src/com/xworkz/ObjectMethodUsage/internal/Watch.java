package com.xworkz.ObjectMethodUsage.internal;

public class Watch {
    private String brand;
    private String type;
    private boolean isSmart;

    public Watch(String brand, String type, boolean isSmart) {
        System.out.println("String, String, boolean-arg const of Watch");
        this.brand = brand;
        this.type = type;
        this.isSmart = isSmart;
    }

    @Override
    public String toString() {
        return "Watch{" +
                "brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                ", isSmart=" + isSmart +
                '}';
    }

    @Override
    public int hashCode() {
        return 2200;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Watch) {
                System.out.println("Ref instanceOf Watch");
                Watch watch1 = this;
                Watch  watch2 = (Watch) obj;
                if (watch2.isSmart == watch1.isSmart && watch2.brand == watch1.brand && watch2.type == watch1.type) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
