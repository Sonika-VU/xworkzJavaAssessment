package com.xworkz.ObjectMethodUsage.internal;

public class LipStick {
    private String brand;
    private String color;
    private int price;

    public LipStick(String brand, String color, int price){
        System.out.println("String, String, int-arg const of LipStick");
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "LipStick{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int hashCode() {
        return 5688;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof LipStick) {
                System.out.println("Ref instanceOf LipStick");
                LipStick lipStick1 = this;
                LipStick  lipStick2 = (LipStick) obj;
                if (lipStick1.color == lipStick2.color && lipStick2.brand == lipStick1.brand) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
