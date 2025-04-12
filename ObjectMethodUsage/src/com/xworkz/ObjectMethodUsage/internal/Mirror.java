package com.xworkz.ObjectMethodUsage.internal;

public class Mirror {
    private String shape;
    private double height;
    private double width;

    public Mirror(String shape, double height, double width) {
        System.out.println("String, double, double-arg const of Mirror");
        this.shape = shape;
        this.height = height;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Mirror{" +
                "shape='" + shape + '\'' +
                ", height=" + height +
                ", width=" + width +
                '}';
    }

    @Override
    public int hashCode() {
        return -8675;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Mirror) {
                System.out.println("Ref instanceOf Mirror");
                Mirror mirror1 = this;
                Mirror  mirror2 = (Mirror) obj;
                if (mirror1.shape == mirror2.shape && mirror1.height == mirror2.height) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
