package com.xworkz.ObjectMethodUsage.internal;

public class Lamp {
    private String style;
    private double height;
    private boolean isLED;

    public Lamp(String style, double height, boolean isLED) {
        System.out.println("String, double, boolean-arg const of Lamp");
        this.style = style;
        this.height = height;
        this.isLED = isLED;
    }

    @Override
    public String toString() {
        return "Lamp{" +
                "style='" + style + '\'' +
                ", height=" + height +
                ", isLED=" + isLED +
                '}';
    }

    @Override
    public int hashCode() {
        return 2902;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Lamp) {
                System.out.println("Ref instanceOf Lamp");
                Lamp lamp1 = this;
                Lamp  lamp2 = (Lamp) obj;
                if (lamp1.style == lamp2.style && lamp1.height == lamp2.height) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
